package com.ss.android.ugc.aweme.feed.assem.story;

import X.C01GW;
import X.C03H5;
import X.C0RKM;
import X.C13IQ;
import X.C13LE;
import X.C300390Bq1;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedStoryTagTriggerV2 extends BaseCellTriggerComponent<FeedStoryTagTriggerV2> implements ComponentPriorityProtocol, VideoGenreTagProtocol {
    public static final /* synthetic */ int LLJLIL = 0;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 247));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 248));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(FeedStoryTagAssemV2.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return zg();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
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
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            if (C300390Bq1.LIZ()) {
                PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
                if (priorityAbility != null) {
                    priorityAbility.MJ(this, new AwS590S0100000_11(this, 104));
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (interactAreaCommonAbility == null) {
                return;
            }
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Context context = getContext();
        int i = FeedStoryTagTrigger.LLJL;
        return C0RKM.LIZ(context, videoItemParams.getAweme(), videoItemParams.mEventType);
    }
}
