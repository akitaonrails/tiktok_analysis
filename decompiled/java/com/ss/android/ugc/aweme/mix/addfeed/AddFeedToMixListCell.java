package com.ss.android.ugc.aweme.mix.addfeed;

import X.C1168620gW4;
import X.C1208930hZ5;
import X.C13LE;
import X.C1602160rnK;
import X.C21412118qt;
import X.C2217381BqS;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS121S0200000_18;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AddFeedToMixListCell extends PowerCell<C1168620gW4> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final C1208930hZ5 LL = new C1208930hZ5(this, 0);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddFeedToMixListCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/mix/addfeed/IMixFeedControl;", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1168620gW4 c1168620gW4 = (C1168620gW4) interfaceC1891350zJl;
        int i = c1168620gW4.LLILZ;
        if (i != 0) {
            if (i == 1) {
                ((AppCompatImageView) this.itemView.findViewById(R.id.f737l2m)).setBackgroundResource(R.drawable.cnu);
                ((TuxTextView) this.itemView.findViewById(R.id.l2u)).setTuxFont(41);
                ((TextView) this.itemView.findViewById(R.id.l2u)).setText(c1168620gW4.LLILLJJLI);
                ((CompoundButton) this.itemView.findViewById(R.id.l3i)).setChecked(c1168620gW4.LLIZ);
                C786410Ut5.U7((C21412118qt) this.itemView.findViewById(R.id.l3i), new ACListenerS121S0200000_18(this, c1168620gW4, 8));
                ImageView imageView = (ImageView) this.itemView.findViewById(R.id.l3j);
                int visibility = imageView.getVisibility();
                imageView.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, imageView);
                View viewFindViewById = this.itemView.findViewById(R.id.l3i);
                int visibility2 = viewFindViewById.getVisibility();
                viewFindViewById.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, viewFindViewById);
                C786410Ut5.I7(new ACListenerS121S0200000_18(this, c1168620gW4, 9), this.itemView);
                return;
            }
            return;
        }
        ((AppCompatImageView) this.itemView.findViewById(R.id.f737l2m)).setBackgroundResource(R.drawable.cnr);
        ((TuxTextView) this.itemView.findViewById(R.id.l2u)).setTuxFont(42);
        ((TextView) this.itemView.findViewById(R.id.l2u)).setText(2131829647);
        View viewFindViewById2 = this.itemView.findViewById(R.id.l3i);
        int visibility3 = viewFindViewById2.getVisibility();
        viewFindViewById2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility3, 8, viewFindViewById2);
        ((AppCompatImageView) this.itemView.findViewById(R.id.l3j)).setBackgroundResource(R.drawable.cnk);
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.l3j);
        int visibility4 = imageView2.getVisibility();
        imageView2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility4, 0, imageView2);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 192), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dnu, viewGroup, false);
    }
}
