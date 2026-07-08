package com.bytedance.android.livesdk.widgets;

import X.C1081010eEl;
import X.C1085120eLO;
import X.C1123290fKx;
import X.C1125140fNw;
import X.C1125360fOI;
import X.C1125380fOK;
import X.C1125860fP6;
import X.C1126110fPV;
import X.C1126150fPZ;
import X.C1126160fPa;
import X.C1126220fPg;
import X.C1128760fTm;
import X.C1128870fTx;
import X.C1130020fVo;
import X.C1130100fVw;
import X.C1130430fWT;
import X.C1131140fXc;
import X.C1132120fZC;
import X.C1132880faQ;
import X.C13BV;
import X.C13LP;
import X.C158B;
import X.C1848410yCV;
import X.C20441214yg;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2868019e;
import X.C500260Jjc;
import X.C784440Upu;
import X.EnumC1123370fL5;
import X.EnumC1126060fPQ;
import X.EnumC1129230fUX;
import X.InterfaceC1131100fXY;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS152S0100000_17;
import Y.AfS186S0100000_17;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.android.live.LiveCommentPanelOpenOptV2Setting;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftGalleryExtra;
import com.bytedance.android.live.gift.SpecialGiftComboVisibilityChannel;
import com.bytedance.android.livesdk.SpecialGiftCombEvent;
import com.bytedance.android.livesdk.livesetting.gift.LiveSpecialGiftComboPinOnInputSetting;
import com.bytedance.android.livesdkapi.depend.event.GiftPinCardPositionUpdateChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNewSpecialGiftWidget extends LiveWidget {
    public C1126220fPg LL;
    public C1126110fPV LLILLJJLI;
    public InterfaceC1131100fXY LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final AwS596S0100000_17 LLILZLL = new AwS596S0100000_17(this, 254);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2d;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void y1() {
        C20441214yg.LIZIZ("LiveNewSpecialGiftWidget", "hideAndReleaseComboView");
        C1126220fPg c1126220fPg = this.LL;
        if (c1126220fPg != null) {
            c1126220fPg.LJFF();
        }
        C1126220fPg c1126220fPg2 = this.LL;
        if (c1126220fPg2 != null) {
            C500260Jjc.LJIILIIL(c1126220fPg2);
        }
        C1126220fPg c1126220fPg3 = this.LL;
        if (c1126220fPg3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg3);
            c1126220fPg3.setTranslationY(0.0f);
        }
        C1126110fPV c1126110fPV = this.LLILLJJLI;
        if (c1126110fPV != null) {
            c1126110fPV.LJII();
        }
        C1126110fPV c1126110fPV2 = this.LLILLJJLI;
        if (c1126110fPV2 != null) {
            C500260Jjc.LJIILIIL(c1126110fPV2);
        }
        C1126110fPV c1126110fPV3 = this.LLILLJJLI;
        if (c1126110fPV3 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126110fPV3);
            c1126110fPV3.setTranslationY(0.0f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C1126220fPg c1126220fPg = (C1126220fPg) findViewById(R.id.hp5);
        this.LL = c1126220fPg;
        C500260Jjc.LJIILIIL(c1126220fPg);
        this.LLILLJJLI = (C1126110fPV) findViewById(R.id.vvn);
        C1126220fPg c1126220fPg2 = this.LL;
        if (c1126220fPg2 != null) {
            c1126220fPg2.setAnimationType(EnumC1123370fL5.SPECIAL);
        }
        C20441214yg.LJIIIZ("LiveNewSpecialGiftWidget", "hideComboViews");
        C500260Jjc.LJIILIIL(this.LL);
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C1126110fPV c1126110fPV = this.LLILLJJLI;
        if (c1126110fPV != null) {
            c1126110fPV.LJII();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(SpecialGiftComboVisibilityChannel.class, Boolean.FALSE);
        }
        C1126220fPg c1126220fPg3 = this.LL;
        if (c1126220fPg3 != null) {
            View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 158);
            if (C1848410yCV.LIZ) {
                aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
            }
            a aVar = new a(aCListenerS152S0100000_17);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1126220fPg3);
            }
            c1126220fPg3.setOnClickListener(aVar);
        }
        C1126220fPg c1126220fPg4 = this.LL;
        if (c1126220fPg4 != null) {
            c1126220fPg4.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0fPd
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return true;
                }
            });
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, SpecialGiftCombEvent.class, this.LLILZLL);
            this.dataChannel.BQ2(this, GiftPinCardPositionUpdateChannel.class, new AwS596S0100000_17(this, 482));
            this.dataChannel.BQ2(this, GiftDialogVisibilityChannel.class, new AwS596S0100000_17(this, 483));
        }
        if (LiveSpecialGiftComboPinOnInputSetting.enabled() && LiveCommentPanelOpenOptV2Setting.INSTANCE.isShowAsFragment()) {
            C784440Upu.LIZ().LIZJ(this, C1085120eLO.class).LIZJ(new AfS186S0100000_17(this, 133));
            C784440Upu.LIZ().LIZJ(this, C1081010eEl.class).LIZJ(new AfS186S0100000_17(this, 134));
        }
    }

    public final void x1(float f) {
        C1126220fPg c1126220fPg = this.LL;
        if (c1126220fPg != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126220fPg);
            c1126220fPg.setTranslationY(f);
        }
        C1126110fPV c1126110fPV = this.LLILLJJLI;
        if (c1126110fPV != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126110fPV);
            c1126110fPV.setTranslationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final void z1(C1132120fZC c1132120fZC) {
        EnumC1126060fPQ comboProgressBarType;
        boolean z;
        boolean z2;
        String str;
        int size;
        C1126160fPa c1126160fPa;
        GiftGalleryExtra giftGalleryExtra;
        List listLLIIII;
        List<C1125380fOK> list;
        List<C1125380fOK> list2;
        List<C1125380fOK> list3;
        DataChannel dataChannel = this.dataChannel;
        InterfaceC1131100fXY interfaceC1131100fXY = this.LLILLL;
        C1126220fPg c1126220fPg = this.LL;
        if (c1126220fPg != null) {
            comboProgressBarType = c1126220fPg.getComboProgressBarType();
        } else {
            comboProgressBarType = null;
        }
        ?? r4 = 0;
        if (comboProgressBarType == EnumC1126060fPQ.GALLERY) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC1131100fXY != null) {
            ArrayList<C1125380fOK> arrayList = new ArrayList();
            C1126160fPa c1126160fPaLJJLIIIJJIZ = interfaceC1131100fXY.LJJLIIIJJIZ();
            if (c1126160fPaLJJLIIIJJIZ != null && (list3 = c1126160fPaLJJLIIIJJIZ.LIZIZ) != null) {
                size = list3.size();
            } else {
                size = 0;
            }
            long j = 1;
            if (size > 1) {
                C1126160fPa c1126160fPaLJJLIIIJJIZ2 = interfaceC1131100fXY.LJJLIIIJJIZ();
                if (c1126160fPaLJJLIIIJJIZ2 != null && (list2 = c1126160fPaLJJLIIIJJIZ2.LIZIZ) != null) {
                    Iterator<C1125380fOK> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
                long jAddAndGet = C1125360fOI.LIZ.addAndGet(1L);
                C1126160fPa c1126160fPaLJJLIIIJJIZ3 = interfaceC1131100fXY.LJJLIIIJJIZ();
                if (c1126160fPaLJJLIIIJJIZ3 == null || (list = c1126160fPaLJJLIIIJJIZ3.LIZIZ) == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
                    listLLIIII = C13BV.INSTANCE;
                }
                c1126160fPa = new C1126160fPa(jAddAndGet, listLLIIII, c1132120fZC);
            } else {
                C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
                if (c1132880faQLIZJ != null) {
                    arrayList.add(new C1125380fOK(c1132880faQLIZJ.LIZ(), interfaceC1131100fXY.LJJJJZ().LIZIZ));
                }
                c1126160fPa = null;
            }
            for (C1125380fOK c1125380fOK : arrayList) {
                C1126150fPZ c1126150fPZ = new C1126150fPZ(EnumC1129230fUX.SPECIAL_GIFT_COMBO, c1125380fOK.LIZIZ);
                C1130020fVo c1130020fVo = InterfaceC1131100fXY.LIZ;
                long giftId = interfaceC1131100fXY.getGiftId();
                int giftType = interfaceC1131100fXY.getGiftType();
                boolean zLJJ = interfaceC1131100fXY.LJJ();
                Room roomLIZ = interfaceC1131100fXY.LIZ();
                int tabId = interfaceC1131100fXY.getTabId();
                c1130020fVo.getClass();
                C1128870fTx c1128870fTxLIZ = C1130020fVo.LIZ(giftId, giftType, 1, zLJJ, roomLIZ, tabId, c1126150fPZ);
                c1128870fTxLIZ.LJLJL = C1123290fKx.LIZ(c1125380fOK.LIZ);
                c1128870fTxLIZ.LJLJJLL = C2868019e.LIZ(interfaceC1131100fXY.LIZ());
                c1128870fTxLIZ.LJIILIIL = interfaceC1131100fXY.LJIIL();
                c1128870fTxLIZ.LJIILJJIL = interfaceC1131100fXY.LJIIZILJ();
                c1128870fTxLIZ.LJIJ = interfaceC1131100fXY.getDiamondCount();
                c1128870fTxLIZ.LJJJJLI = interfaceC1131100fXY.LJL();
                c1128870fTxLIZ.LJJJJL = interfaceC1131100fXY.LJI();
                String strLIZIZ = C1125140fNw.LIZIZ(interfaceC1131100fXY.getGiftExtraForClient(), Intrinsics.LJFF(interfaceC1131100fXY.LJLLLLLL(), "lynx"));
                if (strLIZIZ == null && (strLIZIZ = interfaceC1131100fXY.getSource()) == null) {
                    strLIZIZ = "fast gift combo view";
                }
                c1128870fTxLIZ.LJLJJI = strLIZIZ;
                c1128870fTxLIZ.LJJIIJZLJL = interfaceC1131100fXY.getGiftExtraForClient();
                c1128870fTxLIZ.LJJJI = interfaceC1131100fXY.LJLLL();
                c1128870fTxLIZ.LJJJLL = r4;
                c1128870fTxLIZ.LJJJZ = r4;
                c1128870fTxLIZ.LJL = c1126160fPa;
                c1128870fTxLIZ.LJJLIIIJJI = interfaceC1131100fXY.LJJJLZIJ();
                c1128870fTxLIZ.LJJZZIII = interfaceC1131100fXY.LJJIJ();
                c1128870fTxLIZ.LJLIIIL = interfaceC1131100fXY.LIZIZ();
                c1128870fTxLIZ.LJIILL = r4;
                c1128870fTxLIZ.LJJJ = interfaceC1131100fXY.LJJJLIIL();
                c1128870fTxLIZ.LJJIZ = interfaceC1131100fXY.LJJJJJ();
                c1128870fTxLIZ.LJJII = C158B.LIZ();
                GiftGalleryExtra giftExtraForClient = interfaceC1131100fXY.getGiftExtraForClient();
                if (giftExtraForClient != null) {
                    giftGalleryExtra = new GiftGalleryExtra(giftExtraForClient.isGalleryGift, giftExtraForClient.leftCountToSponsor, giftExtraForClient.isOneClickTitle, giftExtraForClient.canSponsor, giftExtraForClient.realTimeLeftCountToSponsor - j, giftExtraForClient.sponsorCount + j, giftExtraForClient.currentCount + j, z);
                } else {
                    giftGalleryExtra = null;
                }
                c1128870fTxLIZ.LJJIIJZLJL = giftGalleryExtra;
                c1128870fTxLIZ.LJJIIZ = interfaceC1131100fXY.LJJLIIIJJI();
                c1128870fTxLIZ.LJJIIZI = interfaceC1131100fXY.getGiftMagicResultId();
                c1128870fTxLIZ.LJJIJ = interfaceC1131100fXY.LJIIJJI();
                c1128870fTxLIZ.LJJLIIIJLLLLLLLZ = interfaceC1131100fXY.getOutfitGiftIds();
                C1131140fXc.LIZLLL(dataChannel, c1128870fTxLIZ);
                j = 1;
                r4 = 0;
            }
        }
        InterfaceC1131100fXY interfaceC1131100fXY2 = this.LLILLL;
        if (interfaceC1131100fXY2 == null) {
            return;
        }
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        DataChannel dataChannel2 = this.dataChannel;
        long giftId2 = interfaceC1131100fXY2.getGiftId();
        int giftType2 = interfaceC1131100fXY2.getGiftType();
        int iLJJZZI = interfaceC1131100fXY2.LJJZZI();
        Long lValueOf = Long.valueOf(interfaceC1131100fXY2.LJIIL());
        List<Long> listLJLI = interfaceC1131100fXY2.LJLI();
        List<Long> listLJIL = interfaceC1131100fXY2.LJIL();
        List<Long> listLJJIZ = interfaceC1131100fXY2.LJJIZ();
        String strLIZIZ2 = C1125140fNw.LIZIZ(interfaceC1131100fXY2.getGiftExtraForClient(), Intrinsics.LJFF(interfaceC1131100fXY2.LJLLLLLL(), "lynx"));
        C1125860fP6 c1125860fP6LJLLL = interfaceC1131100fXY2.LJLLL();
        c1128760fTm.getClass();
        Long lValueOf2 = Long.valueOf(giftId2);
        if (giftType2 == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C500260Jjc.LJJIIZ(strLIZIZ2)) {
            strLIZIZ2 = c1128760fTm.LJI;
        }
        if (C1130430fWT.LIZ.LIZ) {
            str = "call";
        } else {
            str = "click";
        }
        C1128760fTm.LJJJJL(c1128760fTm, dataChannel2, lValueOf2, false, z2, strLIZIZ2, str, Integer.valueOf(C1130100fVw.LIZ.LJFF), Integer.valueOf(iLJJZZI), lValueOf, listLJLI, listLJIL, listLJJIZ, null, c1125860fP6LJLLL, null, null, null, null, 0, null, null, 3657728);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1(float r6, float r7, int r8, int r9) {
        /*
            r5 = this;
            X.0fPg r0 = r5.LL
            r3 = 0
            if (r0 == 0) goto L9
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
        L9:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L61
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r3 == 0) goto L61
            float r0 = X.C497740JfY.LIZIZ(r6)
            int r1 = (int) r0
            int r1 = r1 + r8
            float r0 = X.C497740JfY.LIZIZ(r7)
            int r4 = (int) r0
            int r4 = r4 + r9
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L5e
            int r0 = r3.leftMargin
        L25:
            r2 = 1
            if (r1 == r0) goto L5c
            r1 = 1
        L29:
            int r0 = r3.bottomMargin
            if (r4 != r0) goto L2e
            r2 = 0
        L2e:
            if (r1 != 0) goto L42
            if (r2 == 0) goto L41
        L32:
            float r0 = X.C497740JfY.LIZIZ(r7)
            int r0 = (int) r0
            int r9 = r9 + r0
            r3.bottomMargin = r9
        L3a:
            X.0fPg r0 = r5.LL
            if (r0 == 0) goto L41
            r0.requestLayout()
        L41:
            return
        L42:
            boolean r0 = X.C497740JfY.LJJ()
            if (r0 == 0) goto L53
            float r0 = X.C497740JfY.LIZIZ(r6)
            int r0 = (int) r0
            int r8 = r8 + r0
            r3.leftMargin = r8
        L50:
            if (r2 == 0) goto L3a
            goto L32
        L53:
            float r0 = X.C497740JfY.LIZIZ(r6)
            int r0 = (int) r0
            int r8 = r8 + r0
            r3.rightMargin = r8
            goto L50
        L5c:
            r1 = 0
            goto L29
        L5e:
            int r0 = r3.rightMargin
            goto L25
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.LiveNewSpecialGiftWidget.A1(float, float, int, int):void");
    }
}
