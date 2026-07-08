package com.ss.android.ugc.aweme.ui.feed.photos.assem;

import X.C01GW;
import X.C03H5;
import X.C0RF0;
import X.C0RKG;
import X.C1351950lHl;
import X.C13IQ;
import X.C13LE;
import X.C1EE2;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C688590Qzh;
import X.C699500RcC;
import X.C700450Rdj;
import X.C704010RjT;
import X.C704020RjU;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.text.TextPaint;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoModeVideoTagTrigger extends BaseCellTriggerComponent<FeedPhotoModeVideoTagTrigger> implements VideoTagCategoryProtocol, VideoGenreTagProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1007));

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedPhotoModeVideoTagAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return C0RKG.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C0RKG.LIZ(this);
    }

    @Override // X.C0RKP
    public final float Lf() {
        TextPaint paint;
        String string;
        AppCompatTextView appCompatTextView = (AppCompatTextView) LJJIJL().findViewById(R.id.zt1);
        float fMeasureText = 0.0f;
        if (!C300390Bq1.LIZ()) {
            return 0.0f;
        }
        if (appCompatTextView != null && (paint = appCompatTextView.getPaint()) != null) {
            CharSequence text = appCompatTextView.getText();
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C418440Gaw.LIZIZ(16) + C418440Gaw.LIZIZ(12);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return C0RKG.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return C300390Bq1.LIZ() ? "genre_tag_photo" : "low_tag_photo";
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        String str;
        boolean z2;
        View viewFindViewById = LJJIJL().findViewById(R.id.zt1);
        View viewFindViewById2 = LJJIJL().findViewById(R.id.lm3);
        View viewFindViewById3 = LJJIJL().findViewById(R.id.qd1);
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        int width = 0;
        if (C300390Bq1.LIZ() && viewFindViewById != null && viewFindViewById2 != null && viewFindViewById3 != null) {
            if (z) {
                if (viewFindViewById.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int iLIZIZ = 22;
                if (z2) {
                    width = viewFindViewById3.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
                }
                C426750GoL.LJIIIZ(viewFindViewById2, null, null, 0, null, false, 27);
                if (C704010RjT.LJ(str)) {
                    iLIZIZ = C704020RjU.LIZIZ();
                }
                C1351950lHl.LJIL(viewFindViewById3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ))));
                C1351950lHl.LJIJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iLIZIZ))), viewFindViewById3);
                C426750GoL.LJIIL(viewFindViewById3, 0, null, 0, null, 26);
                C339190DRl.LIZIZ(viewFindViewById);
            } else {
                C1351950lHl.LJIL(viewFindViewById3, -2);
                C1351950lHl.LJIJI(-2, viewFindViewById3);
                C426750GoL.LJIIL(viewFindViewById3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, 26);
                C426750GoL.LJIIIZ(viewFindViewById2, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
                C339190DRl.LIZLLL(viewFindViewById);
                return 0;
            }
        }
        return width;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 289));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return C1EE2.LIZIZ.LJJLL(videoItemParams.getAweme());
    }
}
