package kotlin.jvm.internal;

import X.C09AY;
import X.C176600m4;
import X.C497740JfY;
import X.C766270U4b;
import X.C931740aM0;
import X.C942210act;
import X.C942610adX;
import X.C946850akN;
import X.C970190bM1;
import X.C971260bNk;
import X.EnumC155700ih;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import android.widget.PopupWindow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class AwS100S0201000_15 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS100S0201000_15 awS100S0201000_15, Object obj) {
        EnumC155700ih enumC155700ih;
        if (((C971260bNk) awS100S0201000_15.l0).LLLFZ() != awS100S0201000_15.i2) {
            EnumC971520bOA enumC971520bOA = EnumC971520bOA.CLICK_SHORTCUT;
            Long lValueOf = Long.valueOf(((C970190bM1) awS100S0201000_15.l1).LIZ.noticeboardTemplateId);
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = ((C971260bNk) awS100S0201000_15.l0).LLILLJJLI.LIZJ;
            multiCanvasUtils.getClass();
            C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "shortcut", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
            int iLLLFZ = ((C971260bNk) awS100S0201000_15.l0).LLLFZ();
            C971260bNk c971260bNk = (C971260bNk) awS100S0201000_15.l0;
            long j = ((C970190bM1) awS100S0201000_15.l1).LIZ.noticeboardTemplateId;
            c971260bNk.LLILZ = j;
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            if (CloudDraftItemManager.LJFF.containsKey(Long.valueOf(j))) {
                enumC155700ih = EnumC155700ih.FINISHED;
            } else {
                enumC155700ih = EnumC155700ih.LOADING;
            }
            c971260bNk.LLILZIL = enumC155700ih;
            if (iLLLFZ != -1 && iLLLFZ >= 0 && iLLLFZ < ((C971260bNk) awS100S0201000_15.l0).LL.size()) {
                C176600m4.LIZJ(new AwS52S0000100_15(((C970190bM1) ListProtector.get(((C971260bNk) awS100S0201000_15.l0).LL, iLLLFZ)).LIZ.noticeboardTemplateId, 0));
                ((C971260bNk) awS100S0201000_15.l0).notifyItemChanged(iLLLFZ);
            }
            ((C971260bNk) awS100S0201000_15.l0).notifyItemChanged(awS100S0201000_15.i2);
            NoticeboardTemplate noticeboardTemplate = ((C970190bM1) awS100S0201000_15.l1).LIZ;
            ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = noticeboardTemplate.convertNoticeboardMaterialInfo;
            if (convertNoticeboardMaterialInfo != null) {
                C971260bNk c971260bNk2 = (C971260bNk) awS100S0201000_15.l0;
                CloudDraftItemManager.LJFF(noticeboardTemplate.noticeboardTemplateId, c971260bNk2.LLIZ, noticeboardTemplate.mediaNodeId, "shortcut", convertNoticeboardMaterialInfo);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r6
      0x003b: PHI (r6v4 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:10:0x0039, B:8:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[PHI: r6
      0x003f: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:10:0x0039, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[PHI: r6 r7
      0x0042: PHI (r6v1 java.lang.String) = (r6v3 java.lang.String), (r6v4 java.lang.String) binds: [B:14:0x0040, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0042: PHI (r7v0 java.lang.String) = (r7v2 java.lang.String), (r7v3 java.lang.String) binds: [B:14:0x0040, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS100S0201000_15 r12, java.lang.Object r13) {
        /*
            tikcast.linkmic.common.LayoutState r13 = (tikcast.linkmic.common.LayoutState) r13
            java.lang.Object r0 = r12.l0
            X.0adX r0 = (X.C942610adX) r0
            int r2 = r12.i2
            r0.LIZ = r2
            java.lang.Object r0 = r12.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment) r0
            X.0amo r1 = r0.LLJZIJLIL
            if (r1 == 0) goto L20
            r0 = -1
            r1.LLIZ = r0
            r1.LLLJ(r2)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.notifyItemChanged(r2, r0)
        L20:
            java.lang.String r2 = "click"
            java.lang.Object r0 = r12.l0
            X.0adX r0 = (X.C942610adX) r0
            java.lang.String r3 = r0.LIZJ
            java.lang.String r4 = r0.LIZLLL
            int r0 = r0.LIZIZ
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r8 = ""
            if (r13 == 0) goto L38
            java.lang.String r6 = r13.layoutId
            if (r6 != 0) goto L3b
        L38:
            r6 = r8
            if (r13 == 0) goto L3f
        L3b:
            java.lang.String r7 = r13.layoutKey
            if (r7 != 0) goto L42
        L3f:
            r7 = r8
            if (r13 == 0) goto L53
        L42:
            tikcast.linkmic.common.MultiGuestLayoutExtra r0 = r13.multiGuestLayoutExtra
            if (r0 == 0) goto L53
            int r0 = r0.currentPanelLayoutType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L53
            r8 = r0
        L53:
            java.lang.String r9 = "1"
            java.lang.Object r0 = r12.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment) r0
            java.util.List r0 = r0.uS()
            if (r0 == 0) goto L80
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r0.iterator()
        L68:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r1.next()
            X.0ams r0 = (X.C948400ams) r0
            int r0 = r0.LIZIZ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L68
            r10.add(r0)
            goto L68
        L80:
            X.13BV r10 = X.C13BV.INSTANCE
        L82:
            java.lang.String r11 = "show_all_panel"
            java.lang.Object r0 = r12.l1
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment) r0
            java.lang.String r12 = r0.LLLFFI
            if (r12 != 0) goto L8e
            java.lang.String r12 = "unknown"
        L8e:
            X.0aM1 r1 = new X.0aM1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C931740aM0.LJIIJJI(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0201000_15.invoke$1(kotlin.jvm.internal.AwS100S0201000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS100S0201000_15 awS100S0201000_15, Object obj) {
        ((Number) obj).intValue();
        ((MultiGuestV3GuestPresenter) awS100S0201000_15.l0).showBeautySettingDialog((Long) awS100S0201000_15.l1, awS100S0201000_15.i2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS100S0201000_15 r13, java.lang.Object r14) {
        /*
            r8 = r14
            X.0tcN r8 = (X.C1672250tcN) r8
            java.lang.Object r2 = r13.l0
            com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel r2 = (com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel) r2
            int r0 = r13.i2
            java.lang.Object r1 = r13.l1
            com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode r1 = (com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode) r1
            r2.getClass()
            r7 = 2
            r11 = 0
            r6 = 1
            if (r0 == r6) goto L28
            if (r0 != r7) goto L49
            X.0tcO r9 = new X.0tcO
            X.0tWw r0 = X.C1669660tYC.i
            r9.<init>(r11, r0, r6, r6)
        L1e:
            r10 = 0
            r14 = 1021(0x3fd, float:1.431E-42)
            r12 = r11
            r13 = r10
            X.0tcN r0 = X.C1672250tcN.LIZ(r8, r9, r10, r11, r12, r13, r14)
            return r0
        L28:
            if (r1 == 0) goto L49
            com.bytedance.android.live.base.model.ImageModel r0 = r1.giftIconImage
            if (r0 == 0) goto L47
            java.util.List r5 = r0.getUrls()
        L32:
            long r3 = r1.giftId
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            if (r5 == 0) goto L49
            X.0tcO r9 = new X.0tcO
            X.04il r0 = new X.04il
            r0.<init>(r5)
            r9.<init>(r0, r11, r6, r7)
            goto L1e
        L47:
            r5 = r11
            goto L32
        L49:
            X.0tcO r9 = new X.0tcO
            X.0tWw r1 = X.C1669660tYC.LLIIIILZ
            r0 = 0
            r9.<init>(r11, r1, r0, r6)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0201000_15.invoke$3(kotlin.jvm.internal.AwS100S0201000_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS100S0201000_15 awS100S0201000_15, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        if (!LayoutSettingContract.LIZLLL((LayoutSettingContract) awS100S0201000_15.l0, null, null, 3)) {
            ((PopupWindow) awS100S0201000_15.l1).dismiss();
            C931740aM0.LJII(awS100S0201000_15.i2, iIntValue, "abnormal", "click", "change", ((LayoutSettingContract) awS100S0201000_15.l0).LJJIL());
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$5(AwS100S0201000_15 awS100S0201000_15, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C942210act.LIZ.getClass();
        int iLJ = C942210act.LJ();
        boolean z = true;
        if (iLJ > iIntValue) {
            ((PopupWindow) awS100S0201000_15.l0).dismiss();
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131843502, Integer.valueOf(iLJ)));
            C931740aM0.LJII(awS100S0201000_15.i2, iIntValue, "abnormal", "click", "change", ((LayoutSettingContract) awS100S0201000_15.l1).LJJIL());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS100S0201000_15(int r3, android.widget.PopupWindow r4, com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.l0 = r4
            r1.i2 = r3
            r1.l1 = r5
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.i2 = r3
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS100S0201000_15.<init>(int, android.widget.PopupWindow, com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0201000_15(int i, C942610adX c942610adX, LayoutMarketFragment layoutMarketFragment, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c942610adX;
        this.i2 = i;
        this.l1 = layoutMarketFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0201000_15(C971260bNk c971260bNk, int i, C970190bM1 c970190bM1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c971260bNk;
        this.i2 = i;
        this.l1 = c970190bM1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0201000_15(MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, Long l, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = multiGuestV3GuestPresenter;
        this.l1 = l;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS100S0201000_15(UpRightIconViewModel upRightIconViewModel, int i, GiftMode giftMode, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = upRightIconViewModel;
        this.i2 = i;
        this.l1 = giftMode;
    }
}
