package ke.co.hello.and.me;

import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(new MyRecyclerAdapter(generatePalettes()));
    }

    private ArrayList<Palette> generatePalettes() {
        ArrayList<Palette> palettes = new ArrayList<>();
        palettes.add(new Palette("RED", "#D32F2F", Color.parseColor("#d32f2f")));
        palettes.add(new Palette("PINK", "#FF4081", Color.parseColor("#ff4081")));
        palettes.add(new Palette("INDIGO", "#7B1FA2", Color.parseColor("#7b1fa2")));
        palettes.add(new Palette("BLUE", "#536DFE", Color.parseColor("#536dfe")));
        palettes.add(new Palette("GREEN", "#388E3C", Color.parseColor("#388e3c")));
        palettes.add(new Palette("ORANGE", "#FF5722", Color.parseColor("#ff5722")));
        palettes.add(new Palette("AMBER", "#FFA000", Color.parseColor("#ffa000")));
        return palettes;
    }
}