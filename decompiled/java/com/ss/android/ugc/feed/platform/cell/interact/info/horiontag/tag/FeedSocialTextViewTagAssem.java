package com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag;

import X.C01GW;
import X.C0RF0;
import X.C11VU;
import X.C13LE;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1AF0;
import X.C2217381BqS;
import X.C299590Boj;
import X.C341940Daq;
import X.C418440Gaw;
import X.C452501pT;
import X.C690430R6j;
import X.C690870R8b;
import X.C704010RjT;
import X.C708460Rqe;
import X.C723580SZw;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedSocialTextViewTagAssem extends DynamicComponent<FeedSocialTextViewTagAssem> {
    public static final int LLLFF = C341940Daq.LIZ(5.0d);
    public final C01GW LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(572));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1275));
    public TagLayout LLLF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.baf;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        List<AwemeTextLabelModel> list;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (list = aweme.textVideoLabels) != null && (!list.isEmpty())) {
            TagLayout tagLayout = this.LLLF;
            TagLayout tagLayout2 = null;
            if (tagLayout == null) {
                tagLayout = null;
            }
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(tagLayout, null);
            tagLayout.removeAllViews();
            List<AwemeTextLabelModel> list2 = aweme.textVideoLabels;
            if (list2 != null) {
                int i = 0;
                for (AwemeTextLabelModel awemeTextLabelModel : list2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
                        if (awemeTextLabelModel2 != null) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C11VU.LIZ(22.0f));
                            if (i == 0) {
                                layoutParams.leftMargin = (int) C11VU.LIZ(0.0f);
                            } else {
                                layoutParams.leftMargin = (int) C11VU.LIZ(7.0f);
                            }
                            TagLayout tagLayout3 = this.LLLF;
                            if (tagLayout3 == null) {
                                tagLayout3 = null;
                            }
                            View childAt = tagLayout3.getChildAt(i);
                            if (childAt == null) {
                                TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
                                TagLayout tagLayout4 = this.LLLF;
                                if (tagLayout4 == null) {
                                    tagLayout4 = null;
                                }
                                tagLayout4.addView(tuxTextView, -1, layoutParams);
                                Fp(tuxTextView, awemeTextLabelModel2);
                            } else if (childAt instanceof TuxTextView) {
                                Fp((TuxTextView) childAt, awemeTextLabelModel2);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            TagLayout tagLayout5 = this.LLLF;
            if (tagLayout5 != null) {
                tagLayout2 = tagLayout5;
            }
            C708460Rqe.LIZIZ(tagLayout2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLF = (TagLayout) view.findViewById(R.id.hv4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RqY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(218), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0RqZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(219), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.trigger.DynamicComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    public final void Fp(TuxTextView tuxTextView, AwemeTextLabelModel awemeTextLabelModel) {
        C690870R8b c690870R8b;
        tuxTextView.setTag(R.id.abd, Long.valueOf(C814420VxA.LIZJ(awemeTextLabelModel.getShowSeconds() * LSPassThroughRecordSizeConfig.DEFAULT)));
        tuxTextView.setId(R.id.hv4);
        tuxTextView.setTag(Integer.valueOf(awemeTextLabelModel.getLabelType()));
        tuxTextView.setText(awemeTextLabelModel.getLabelName());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        tuxTextView.setGravity(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorProtector.parseColor(awemeTextLabelModel.getBgColor()));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
        tuxTextView.setBackgroundDrawable(gradientDrawable);
        int i = LLLFF;
        tuxTextView.setPadding(i, 0, i, 0);
        tuxTextView.setSingleLine();
        tuxTextView.setMaxEms(20);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.B5(tuxTextView, 1.0f);
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
        if (C704010RjT.LJ(str)) {
            C704010RjT.LIZLLL(tuxTextView);
            C704010RjT.LIZIZ(tuxTextView);
        }
    }
}
