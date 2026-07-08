package com.ss.android.ugc.aweme.theater.consumption.entrance;

import X.C01GW;
import X.C0RKP;
import X.C1A5L;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C426750GoL;
import X.C452501pT;
import X.C547930LeJ;
import X.C786410Ut5;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AITheaterCastUIAssem extends BaseCellSlotComponent<AITheaterCastUIAssem> implements C0RKP {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 956));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 957));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 955));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ng;
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        return 0;
    }

    @Override // X.C0RKP
    public final float Lf() {
        float fMeasureText;
        TextPaint paint;
        String string;
        CharSequence text;
        TextView textView = (TextView) this.LLJLLL.getValue();
        if (textView == null || (paint = textView.getPaint()) == null) {
            fMeasureText = 0.0f;
        } else {
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLJLLL.getValue();
            if (appCompatTextView == null || (text = appCompatTextView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C339190DRl.LIZ(12) + C339190DRl.LIZ(16);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        ((TextView) this.LLJLLL.getValue()).setText(String.valueOf(C547930LeJ.LIZ(2131826060, new Object[0])));
        C426750GoL.LJIIIZ(LJJIJL(), Integer.valueOf((int) C339190DRl.LIZ(4)), null, null, null, false, 30);
        C2271391DvN.LIZ((View) this.LLJZ.getValue(), (C1A5L) C2271381DvM.T0.getValue());
        C786410Ut5.I7(new AkS80S0100000_8(this, 36), getContentView());
    }
}
