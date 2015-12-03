package ke.co.hello.and.me;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

/**
 * Created by AND on 12/2/2015.
 */
public class PaletteViewHolder extends RecyclerView.ViewHolder {
    protected TextView titleText;
    protected TextView contentText;
    protected CardView card;
    public PaletteViewHolder(View itemView) {
        super(itemView);
        titleText = (TextView) itemView.findViewById(R.id.name);
        contentText = (TextView) itemView.findViewById(R.id.hexValue);
        card = (CardView) itemView;
    }
}
