package com.ss.android.ugc.aweme;

import X.AnonymousClass0610;
import X.C01GW;
import X.C054B;
import X.C054G;
import X.C057M;
import X.C061C;
import X.C061D;
import X.C0BJD;
import X.C0I0B;
import X.C0PEM;
import X.C0RT2;
import X.C0YNY;
import X.C1227904rF;
import X.C1389890mGx;
import X.C13LE;
import X.C1400340mXo;
import X.C161N;
import X.C1668706g9;
import X.C1712806nG;
import X.C1756006uE;
import X.C1756206uG;
import X.C1759506un;
import X.C1759706up;
import X.C1759806uq;
import X.C1759906ur;
import X.C1760006us;
import X.C1760106ut;
import X.C1760206uu;
import X.C1760306uv;
import X.C1760706uz;
import X.C1761006v2;
import X.C1761106v3;
import X.C1807670x8n;
import X.C19EG;
import X.C1DEV;
import X.C2191201ApK;
import X.C2217381BqS;
import X.C2232408os;
import X.C2296808zG;
import X.C306990C1p;
import X.C746760TRa;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C903380ZcG;
import X.EnumC12986056i;
import X.EnumC12995056r;
import X.EnumC1390800mIQ;
import X.EnumC207101162h;
import X.InterfaceC12999056v;
import X.InterfaceC2217461Bqa;
import X.InterfaceC874680YTa;
import X.InterfaceC901070ZWn;
import X.InterfaceC901080ZWo;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.IChatRoomEventTrackingStore;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMTranslationServiceImpl implements IIMTranslationService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final C2232408os LIZ = new C2232408os(C786410Ut5.h4());
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C1DEV LIZJ = C2191201ApK.LIZ();
    public volatile C1761006v2 LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMTranslationServiceImpl.class, "fakeMsgModelUtil", "getFakeMsgModelUtil()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/datasource/utils/FakeMsgModelUtil;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static InterfaceC12999056v LIZIZ() {
        IFrequencyControlSyncService iFrequencyControlSyncService = (IFrequencyControlSyncService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlSyncService.class, false, false, false, 14, null);
        if (iFrequencyControlSyncService == null) {
            return null;
        }
        return iFrequencyControlSyncService.LIZ(EnumC12986056i.MANUAL_TRANSLATION_COUNT.getSceneName(), new C054B("legacy_manual_translation_tux_sheet_v1", AFwS187S0000000_2.get$arr$(136), AFwS187S0000000_2.get$arr$(135)));
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LIZJ() {
        C161N.LIZIZ.LJLJJLL(EnumC207101162h.DIRECT_MESSAGE, new C1760006us(new C1759706up(this), new C1759506un(this), LJIIIZ(), new C1759906ur(), new C1760306uv(), 96));
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LIZLLL() {
        C161N.LIZIZ.LJLL(EnumC207101162h.DIRECT_MESSAGE);
        C1760106ut.LIZ.clear();
        C1760106ut.LIZIZ.clear();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final boolean LJIIIZ() {
        C061D c061dLJIILIIL;
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJIILJJIL();
        }
        if (!LJIILLIIL()) {
            return false;
        }
        C01GW c01gw = C1712806nG.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 3 || ((Number) c01gw.getValue()).intValue() == 4) {
            if (!AnonymousClass0610.LIZ()) {
                return ((Boolean) C1712806nG.LIZIZ.getValue()).booleanValue();
            }
            IIMBusinessChatService.LIZ.getClass();
            IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
            if (iIMBusinessChatService != null && (c061dLJIILIIL = iIMBusinessChatService.LJIILIIL()) != null && c061dLJIILIIL.LIZ(C061C.B2C_AUTO_TRANSLATION)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIILL() {
        if (!C306990C1p.LIZ(EnumC12986056i.MANUAL_TRANSLATION_COUNT.getSceneName())) {
            C057M.LIZ(0);
            return;
        }
        InterfaceC12999056v interfaceC12999056vLIZIZ = LIZIZ();
        if (interfaceC12999056vLIZIZ != null) {
            EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            interfaceC12999056vLIZIZ.LIZLLL(enumC12995056r, curUserId);
        }
        C057M.LIZ(0);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final boolean LJIILLIIL() {
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LJIILJJIL();
        }
        return !C0BJD.LIZ() && ((Number) C1760206uu.LIZ.getValue()).intValue() > 0;
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final InterfaceC901070ZWn LJIIL() {
        return C1759806uq.LIZ;
    }

    public final C869590Y9l LIZ(String str) {
        String strLIZ;
        C1756006uE c1756006uELIZ;
        C869590Y9l c869590Y9lLIZLLL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZLLL(str);
        if (c869590Y9lLIZLLL == null) {
            if (this.LIZLLL == null) {
                synchronized (this) {
                    if (this.LIZLLL == null) {
                        this.LIZLLL = (C1761006v2) C1807670x8n.LLLLLJLJLL();
                    }
                }
            }
            IChatRoomEventTrackingStore.LIZ.getClass();
            IChatRoomEventTrackingStore iChatRoomEventTrackingStoreLIZ = C1761106v3.LIZ();
            if (iChatRoomEventTrackingStoreLIZ == null || (strLIZ = iChatRoomEventTrackingStoreLIZ.LIZ()) == null || (c1756006uELIZ = C1756206uG.LIZ(strLIZ, str)) == null) {
                return null;
            }
            return c1756006uELIZ.LIZ;
        }
        return c869590Y9lLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJ(View view) {
        if (!LJIIIZ()) {
            return;
        }
        if (C746760TRa.LIZ().LJJIJIIJI()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(view.getContext().getString(2131830827));
            c1389890mGx.LJIIJJI();
        } else {
            C746760TRa.LIZ().LJLL("setting", true);
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            c1389890mGx2.LJIIJ(view.getContext().getString(2131830826));
            c1389890mGx2.LJIIJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJFF(C19EG c19eg) {
        C0RT2.LIZ().LIZIZ(c19eg, null, "DIRECT_MESSAGE", EnumC1390800mIQ.DM_CHAT_PAGE_ICON);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final C903380ZcG LJI(String str) {
        return C1760106ut.LIZIZ.get(str);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJII(View view) {
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131830828);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final IMTranslationData LJIIIIZZ(C869590Y9l c869590Y9l) {
        String str;
        if (LJIILLIIL() && (str = c869590Y9l.getLocalExt().get("im_translation_data_key")) != null) {
            try {
                C1227904rF.LIZ.getClass();
                return (IMTranslationData) C1227904rF.LIZIZ(str, IMTranslationData.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIIJ(View view) {
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131830829);
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final InterfaceC901080ZWo LJIILIIL(String str) {
        InterfaceC901080ZWo interfaceC901080ZWo = C1760106ut.LIZ.get(str);
        if (interfaceC901080ZWo == null) {
            return C1760706uz.LIZ;
        }
        return interfaceC901080ZWo;
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIILJJIL(String str, InterfaceC901080ZWo interfaceC901080ZWo) {
        C1760106ut.LIZ.put(str, interfaceC901080ZWo);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIIZILJ(String str, C903380ZcG c903380ZcG) {
        C1760106ut.LIZIZ.put(str, c903380ZcG);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.content.Context r21, androidx.fragment.app.FragmentManager r22, X.C869590Y9l r23) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.IMTranslationServiceImpl.LJIIJJI(android.content.Context, androidx.fragment.app.FragmentManager, X.0Y9l):void");
    }
}
