package com.ss.android.ugc.aweme.feed.assem.story;

import X.C01GW;
import X.C03H5;
import X.C0RKG;
import X.C0RKM;
import X.C13IQ;
import X.C13LE;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C688590Qzh;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagTrigger extends BaseCellTriggerComponent<FeedStoryTagTrigger> implements VideoTagCategoryProtocol, VideoGenreTagProtocol {
    public static final /* synthetic */ int LLJL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 246));

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
        return C13LE.LIZ(FeedStoryTagAssem.class);
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
        CharSequence text;
        float fMeasureText = 0.0f;
        if (!C300390Bq1.LIZ()) {
            return 0.0f;
        }
        TuxTextView tuxTextViewYp = yp();
        if (tuxTextViewYp != null && (paint = tuxTextViewYp.getPaint()) != null) {
            TuxTextView tuxTextViewYp2 = yp();
            if (tuxTextViewYp2 == null || (text = tuxTextViewYp2.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            fMeasureText = paint.measureText(string);
        }
        return fMeasureText + C418440Gaw.LIZIZ(12) + C418440Gaw.LIZIZ(12);
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

    public final TuxTextView yp() {
        return (TuxTextView) LJJIJL().findViewById(R.id.w9a);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return C300390Bq1.LIZ() ? "genre_tag_story" : "low_tag_story";
    }

    @Override // X.C0RKP
    public final int ka(boolean z) {
        int iLIZIZ;
        int width;
        if (!C300390Bq1.LIZ() || LJJIJL().findViewById(R.id.w__) == null || yp() == null || LJJIJL().findViewById(R.id.w_a) == null) {
            return 0;
        }
        if (z) {
            TuxTextView tuxTextViewYp = yp();
            if (tuxTextViewYp != null && tuxTextViewYp.getVisibility() == 0) {
                View viewFindViewById = LJJIJL().findViewById(R.id.w_a);
                if (viewFindViewById != null) {
                    width = viewFindViewById.getWidth();
                } else {
                    width = 0;
                }
                iLIZIZ = width - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            } else {
                iLIZIZ = 0;
            }
            View viewFindViewById2 = LJJIJL().findViewById(R.id.w__);
            if (viewFindViewById2 != null) {
                C426750GoL.LJIIIZ(viewFindViewById2, null, null, 0, null, false, 27);
            }
            C339190DRl.LIZIZ(yp());
            return iLIZIZ;
        }
        View viewFindViewById3 = LJJIJL().findViewById(R.id.w__);
        if (viewFindViewById3 != null) {
            C426750GoL.LJIIIZ(viewFindViewById3, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 27);
        }
        C339190DRl.LIZLLL(yp());
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams) && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 103));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        return C0RKM.LIZ(getContext(), videoItemParams.getAweme(), videoItemParams.mEventType);
    }
}
