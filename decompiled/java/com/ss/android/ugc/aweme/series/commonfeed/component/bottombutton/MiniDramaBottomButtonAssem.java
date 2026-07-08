package com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton;

import X.C01GW;
import X.C0SFC;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1611790s2r;
import X.C1697810uHb;
import X.C1967407nE;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C718180SFc;
import X.C718190SFd;
import X.C718220SFg;
import X.C718300SFo;
import X.C718510SGj;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.InterfaceC702820RhY;
import X.InterfaceC718610SGt;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class MiniDramaBottomButtonAssem extends BaseCellSlotComponent<MiniDramaBottomButtonAssem> implements InterfaceC702820RhY, FcpStandardPreloadProtocol {
    public TuxTextView LLJLLIL;
    public View LLJLLL;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;
    public TuxTextView LLL;
    public View LLLF;
    public View LLLFF;
    public DramaBottomButton LLLFFI;
    public View LLLFZ;
    public View LLLI;
    public View LLLII;
    public View LLLIIII;
    public TuxTextView LLLIIIIL;
    public TuxTextView LLLIIIL;
    public View LLLIIL;
    public SmartImageView LLLIILIL;
    public TuxTextView LLLIL;
    public TuxTextView LLLILZ;
    public View LLLILZJ;
    public TuxTextView LLLILZLLLI;
    public final C01GW LLLIZZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(306));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bgx;
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> Pi() {
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        Pair[] pairArr = new Pair[4];
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Boolean boolValueOf = Boolean.valueOf(Bp((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)) != null);
        c1611790s2r.getClass();
        pairArr[0] = new Pair("is_with_coin_guide", String.valueOf(C1611790s2r.LJIIL(boolValueOf)));
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        C724270Sb3 c724270Sb33 = this.LLJI;
        pairArr[1] = new Pair("series_feed_type", C718180SFc.LIZLLL(aweme, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType));
        C724270Sb3 c724270Sb34 = this.LLJI;
        String strLJ = C718180SFc.LJ(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme());
        if (strLJ == null) {
            strLJ = "";
        }
        pairArr[2] = new Pair("series_video_type", strLJ);
        C724270Sb3 c724270Sb35 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme();
        C724270Sb3 c724270Sb36 = this.LLJI;
        pairArr[3] = new Pair("series_component_type", C718180SFc.LIZJ(aweme2, ((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).mEventType));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        C724270Sb3 c724270Sb37 = this.LLJI;
        PaidContentInfo paidContentInfo = ((VideoItemParams) (c724270Sb37 != null ? c724270Sb37.LL : null)).getAweme().mPaidContentInfo;
        if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
            mapLJI.putAll(logExtra);
        }
        return mapLJI;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> so1() {
        return null;
    }

    @Override // X.InterfaceC702820RhY
    public final void E2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (Bp((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)) != null) {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIILL();
            C724270Sb3 c724270Sb32 = this.LLJI;
            ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().getAid();
            C724270Sb3 c724270Sb33 = this.LLJI;
            C718220SFg.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> Yr2() {
        return C2097908Jt.LIZJ(new Pair(SeriesBottomButtonEntrancePreloadTask.class, new AwS555S0100000_11(this, 529)));
    }

    @Override // X.InterfaceC702820RhY
    public final void mk() {
        if (this.LLLFFI != null) {
            ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIILL();
            C724270Sb3 c724270Sb3 = this.LLJI;
            ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
            C724270Sb3 c724270Sb32 = this.LLJI;
            C718220SFg.LIZ();
        }
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> u8() {
        String strLIZJ;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Map<String, String> logExtra;
        HashMap map = new HashMap();
        C1611790s2r c1611790s2r = C1611790s2r.LIZ;
        Boolean boolValueOf = Boolean.valueOf(this.LLLFFI != null);
        c1611790s2r.getClass();
        map.put("is_with_coin_guide", String.valueOf(C1611790s2r.LJIIL(boolValueOf)));
        C724270Sb3 c724270Sb3 = this.LLJI;
        PaidContentInfo paidContentInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().mPaidContentInfo;
        if (paidContentInfo != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            String strLJ = C718180SFc.LJ(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            if (strLJ == null) {
                strLJ = "";
            }
            map.put("series_video_type", strLJ);
            C724270Sb3 c724270Sb33 = this.LLJI;
            PaidContentInfo paidContentInfo2 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().mPaidContentInfo;
            map.put("series_collection_id", String.valueOf(paidContentInfo2 != null ? Long.valueOf(paidContentInfo2.getPaidCollectionId()) : null));
            C724270Sb3 c724270Sb34 = this.LLJI;
            map.put("series_state", (C718300SFo.LIZ(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme()) || paidContentInfo.isLimitedFreeShortDrama()) ? "limited_free_series" : "paid_series");
            map.put("series_category", String.valueOf(paidContentInfo.getCategory()));
            C724270Sb3 c724270Sb35 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb35 != null ? c724270Sb35.LL : null)).getAweme();
            C724270Sb3 c724270Sb36 = this.LLJI;
            map.put("series_component_type", C718180SFc.LIZJ(aweme, ((VideoItemParams) (c724270Sb36 != null ? c724270Sb36.LL : null)).mEventType));
            C724270Sb3 c724270Sb37 = this.LLJI;
            Aweme aweme2 = ((VideoItemParams) (c724270Sb37 != null ? c724270Sb37.LL : null)).getAweme();
            C724270Sb3 c724270Sb38 = this.LLJI;
            map.put("series_feed_type", C718180SFc.LIZLLL(aweme2, ((VideoItemParams) (c724270Sb38 != null ? c724270Sb38.LL : null)).mEventType));
            View viewLIZIZ = C1967407nE.LIZIZ((ViewGroup) LJJIJL());
            C724270Sb3 c724270Sb39 = this.LLJI;
            if (C718190SFd.LIZIZ(((VideoItemParams) (c724270Sb39 != null ? c724270Sb39.LL : null)).getAweme())) {
                Integer numValueOf = viewLIZIZ != null ? Integer.valueOf(viewLIZIZ.getId()) : null;
                View view = this.LLLIIII;
                strLIZJ = Intrinsics.LJFF(numValueOf, view != null ? Integer.valueOf(view.getId()) : null) ? "dual_button_play_next" : "dual_button_watch_all";
            } else {
                C724270Sb3 c724270Sb310 = this.LLJI;
                Aweme aweme3 = ((VideoItemParams) (c724270Sb310 != null ? c724270Sb310.LL : null)).getAweme();
                C724270Sb3 c724270Sb311 = this.LLJI;
                strLIZJ = C718180SFc.LIZJ(aweme3, ((VideoItemParams) (c724270Sb311 != null ? c724270Sb311.LL : null)).mEventType);
            }
            map.put("series_click_content", strLIZJ);
            C724270Sb3 c724270Sb312 = this.LLJI;
            PaidContentInfo paidContentInfo3 = ((VideoItemParams) (c724270Sb312 != null ? c724270Sb312.LL : null)).getAweme().mPaidContentInfo;
            if (paidContentInfo3 != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo3)) != null && (logExtra = paidContentMiniDramaInfoLIZ.getLogExtra()) != null) {
                map.putAll(logExtra);
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        PaidContentInfo paidContentInfo = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().mPaidContentInfo;
        if (paidContentInfo != null) {
            paidContentInfo.removeCustomPayload("drama_cta_checked");
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        PaidContentInfo paidContentInfo2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme().mPaidContentInfo;
        if (paidContentInfo2 != null) {
            paidContentInfo2.removeCustomPayload("drama_cta_button");
        }
        this.LLLFFI = null;
    }

    public final void Ep() {
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        Context context = getContext();
        if (context != null) {
            C0SFC c0sfc = C0SFC.LIZIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            String aid = aweme.getAid();
            PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
            String jumpEpisodeVideoId = (paidContentInfo2 == null || (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo2)) == null) ? null : paidContentMiniDramaInfoLIZ2.getJumpEpisodeVideoId();
            PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
            Boolean boolIsJumpLastWatch = (paidContentInfo3 == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo3)) == null) ? null : paidContentMiniDramaInfoLIZ.isJumpLastWatch();
            if (!C718510SGj.LIZJ(aweme)) {
                if (jumpEpisodeVideoId != null && jumpEpisodeVideoId.length() != 0) {
                    aid = jumpEpisodeVideoId;
                } else if (Intrinsics.LJFF(boolIsJumpLastWatch, Boolean.TRUE) || (paidContentInfo = aweme.mPaidContentInfo) == null || paidContentInfo.isPaidCollectionIntro()) {
                    aid = null;
                }
            }
            C724270Sb3 c724270Sb32 = this.LLJI;
            Aweme aweme2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
            C724270Sb3 c724270Sb33 = this.LLJI;
            c0sfc.LIZ(c19egLIZ, context, aid, aweme2, ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType, Boolean.FALSE, "", AFwS243S0000000_11.get$arr$(310));
        }
    }

    @Override // X.InterfaceC702820RhY
    public final Map<String, String> R9() {
        return u8();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), FcpStandardPreloadProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    public final DramaBottomButton Bp(VideoItemParams videoItemParams) {
        Object obj;
        Object customPayload;
        Object customPayload2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot")) {
            return null;
        }
        PaidContentInfo paidContentInfo = videoItemParams.getAweme().mPaidContentInfo;
        if (paidContentInfo != null) {
            customPayload = paidContentInfo.getCustomPayload("drama_cta_checked");
        } else {
            customPayload = null;
        }
        if (!(customPayload instanceof Boolean)) {
            customPayload = null;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(customPayload, bool)) {
            PaidContentInfo paidContentInfo2 = videoItemParams.getAweme().mPaidContentInfo;
            if (paidContentInfo2 != null) {
                customPayload2 = paidContentInfo2.getCustomPayload("drama_cta_button");
            } else {
                customPayload2 = null;
            }
            if (!(customPayload2 instanceof DramaBottomButton)) {
                return null;
            }
            return (DramaBottomButton) customPayload2;
        }
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJIILL();
        DramaBottomButton dramaBottomButtonLIZIZ = C718220SFg.LIZIZ();
        PaidContentInfo paidContentInfo3 = videoItemParams.getAweme().mPaidContentInfo;
        if (paidContentInfo3 != null) {
            paidContentInfo3.putCustomPayload("drama_cta_checked", bool);
        }
        PaidContentInfo paidContentInfo4 = videoItemParams.getAweme().mPaidContentInfo;
        if (paidContentInfo4 != null) {
            paidContentInfo4.putCustomPayload("drama_cta_button", dramaBottomButtonLIZIZ);
        }
        return dramaBottomButtonLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x02c1 A[PHI: r2
      0x02c1: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:210:0x02bf, B:208:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton.MiniDramaBottomButtonAssem.tp(java.lang.Object):void");
    }
}
