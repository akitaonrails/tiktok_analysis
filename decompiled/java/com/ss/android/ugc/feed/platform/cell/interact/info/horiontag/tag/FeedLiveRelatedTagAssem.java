package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C0RF0;
import X.C1559260qg8;
import X.C1AF0;
import X.C299590Boj;
import X.C339190DRl;
import X.C426750GoL;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C723580SZw;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.LiveInfo;
import com.ss.android.ugc.aweme.feed.model.LiveRelatedLabelInfo;
import com.ss.android.ugc.aweme.feed.model.LiveRelatedLabelType;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedLiveRelatedTagAssem extends SimpleTagTemplateComponent<FeedLiveRelatedTagAssem> {
    public TuxTextView LLLFF;

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    public final void Fp(VideoItemParams videoItemParams) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent
    public final int Gp() {
        return R.layout.b__;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        String str;
        C690870R8b c690870R8b;
        TuxTextView tuxTextView;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        LiveInfo liveInfo;
        LiveRelatedLabelInfo liveRelatedLabelInfo;
        Aweme aweme = videoItemParams.getAweme();
        String str2 = null;
        if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (liveInfo = standardBusinessModel.getLiveInfo()) != null && (liveRelatedLabelInfo = liveInfo.liveRelatedLabel) != null) {
            str = liveRelatedLabelInfo.labelType;
        } else {
            str = null;
        }
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str2 = c0rf0.LJIIIZ;
        }
        if (!C704010RjT.LJ(str2)) {
            tuxTextView = this.LLLFF;
        } else {
            tuxTextView = this.LLLF;
        }
        String str3 = "";
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_LIVE_GIFTER.getValue())) {
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null && (string6 = context.getString(2131856882)) != null) {
                    str3 = string6;
                }
                tuxTextView.setText(str3);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_RECENT_GUEST.getValue())) {
            if (tuxTextView == null) {
                return;
            }
            Context context2 = getContext();
            if (context2 != null && (string5 = context2.getString(2131856883)) != null) {
                str3 = string5;
            }
            tuxTextView.setText(str3);
            return;
        }
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_COMMENT_LIVE.getValue())) {
            if (tuxTextView == null) {
                return;
            }
            Context context3 = getContext();
            if (context3 != null && (string4 = context3.getString(2131856881)) != null) {
                str3 = string4;
            }
            tuxTextView.setText(str3);
            return;
        }
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_MIN_WATCH.getValue())) {
            if (tuxTextView == null) {
                return;
            }
            Context context4 = getContext();
            if (context4 != null && (string3 = context4.getString(2131856884)) != null) {
                str3 = string3;
            }
            tuxTextView.setText(str3);
            return;
        }
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_WATCH_LIVE.getValue())) {
            if (tuxTextView == null) {
                return;
            }
            Context context5 = getContext();
            if (context5 != null && (string2 = context5.getString(2131856886)) != null) {
                str3 = string2;
            }
            tuxTextView.setText(str3);
            return;
        }
        if (Intrinsics.LJFF(str, LiveRelatedLabelType.LIVE_RELATED_LABEL_TYPE_INTERACTED_LIVE.getValue())) {
            if (tuxTextView == null) {
                return;
            }
            Context context6 = getContext();
            if (context6 != null && (string = context6.getString(2131856885)) != null) {
                str3 = string;
            }
            tuxTextView.setText(str3);
            return;
        }
        C339190DRl.LIZIZ(LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C690870R8b c690870R8b;
        super.onViewCreated(view);
        String str = null;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(this, C690430R6j.class, null), checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        }
        if (!C704010RjT.LJ(str)) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zt1);
            this.LLLFF = tuxTextView;
            if (tuxTextView != null) {
                tuxTextView.setMaxWidth(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.b_n);
        }
        TuxTextView tuxTextView2 = this.LLLF;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.z_);
        }
        TuxIconView tuxIconView = this.LLL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view3 = this.LLJZIJLIL;
        if (view3 == null) {
            return;
        }
        C426750GoL.LJIIIZ(view3, Integer.valueOf((int) C339190DRl.LIZ(4)), null, null, null, false, 30);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.SimpleTagTemplateComponent, com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
