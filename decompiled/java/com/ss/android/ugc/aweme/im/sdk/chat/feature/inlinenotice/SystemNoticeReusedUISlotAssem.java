package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C069P;
import X.C06XO;
import X.C0ZQZ;
import X.C1559260qg8;
import X.C1587706Jn;
import X.C1622006Ws;
import X.C1622306Wv;
import X.C1671406ga;
import X.C1671606gc;
import X.C1672606gm;
import X.C2211751BhN;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724270Sb3;
import X.C869590Y9l;
import X.EnumC432220GxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1681406iC;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1767306w3;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.controller.SystemContentTemplateParser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice.SystemNoticeReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.vm.SkeletonLayoutCellFragmentScopeViewModel;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemNoticeReusedUISlotAssem extends ReusedUISlotAssem<SystemNoticeReusedUISlotAssem> implements InterfaceC712990Rxx<C06XO> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 374));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 377));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm9;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void op() {
        String strLIZJ;
        InterfaceC1681406iC interfaceC1681406iCLIZ;
        InterfaceC1681406iC interfaceC1681406iCLIZ2;
        C724270Sb3 c724270Sb3 = this.LLJI;
        C869590Y9l c869590Y9l = ((C06XO) (c724270Sb3 != null ? c724270Sb3.LL : null)).LL.LIZ;
        ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
        if (iSocialGameService == null || (interfaceC1681406iCLIZ2 = iSocialGameService.LIZ()) == null || (strLIZJ = interfaceC1681406iCLIZ2.LIZJ(c869590Y9l.getScene())) == null) {
            if (c869590Y9l.getMsgType() != 4070) {
                return;
            } else {
                strLIZJ = "guide_inline";
            }
        }
        ISocialGameService iSocialGameService2 = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
        if (iSocialGameService2 == null || (interfaceC1681406iCLIZ = iSocialGameService2.LIZ()) == null) {
            return;
        }
        SessionInfo sessionInfo = ((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL;
        C724270Sb3 c724270Sb32 = this.LLJI;
        C1622006Ws<SystemContent> c1622006Ws = ((C06XO) (c724270Sb32 != null ? c724270Sb32.LL : null)).LLILLJJLI;
        interfaceC1681406iCLIZ.LIZ(sessionInfo, c1622006Ws != null ? c1622006Ws.LIZ : null, strLIZJ);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJL.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            easterEggShareMessageAnimatorAbility.LIZLLL(LJJIJL(), EnumC432220GxA.INLINE);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C2211751BhN.LIZ(view, new AbstractC2211791BhR(this) { // from class: X.06gl
            public Function0<String> LJ;
            public final boolean LJFF = true;
            public final float LJI = 0.001f;
            public final C1689306jT LJII;

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJII;
            }

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJI;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [X.06jT] */
            {
                this.LJ = new AwS546S0100000_2(this, 375);
                this.LJII = new InterfaceC2211931Bhf() { // from class: X.06jT
                    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

                    static {
                        C2217401BqU c2217401BqU = new C2217401BqU(C1689306jT.class, "skeletonLayoutCellFragmentScopeViewModel", "<v#0>", 0);
                        C13LE.LIZ.getClass();
                        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
                    }

                    @Override // X.InterfaceC2211931Bhf
                    public final void LIZ(View view2, String str) {
                        try {
                            SystemNoticeReusedUISlotAssem systemNoticeReusedUISlotAssem = this;
                            C019F c019f = C019F.LIZ;
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkeletonLayoutCellFragmentScopeViewModel.class);
                            if (((SkeletonLayoutCellFragmentScopeViewModel) C737910Sx3.LIZ(systemNoticeReusedUISlotAssem, C724750Sbp.LJIIJ(systemNoticeReusedUISlotAssem, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 376), null, AFwS229S0000000_2.get$arr$(268)).getValue(null, LIZIZ[0])).LL.add(str)) {
                                this.op();
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                };
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C06XO c06xo) {
        C06XO c06xo2 = c06xo;
        int iLIZ = C1671406ga.LIZ();
        C1622006Ws<SystemContent> c1622006Ws = c06xo2.LLILLJJLI;
        if (c1622006Ws != null) {
            SystemContentTemplateParser systemContentTemplateParser = SystemContentTemplateParser.LIZIZ;
            SystemContent systemContent = c1622006Ws.LIZ;
            C0ZQZ c0zqz = new C0ZQZ(R.id.omg, new C1671606gc((View) this.LLJLIL.getValue()));
            C869590Y9l c869590Y9l = c06xo2.LL.LIZ;
            C1622306Wv c1622306Wv = c06xo2.LLILLL;
            IMContactApi.LIZ.getClass();
            systemContentTemplateParser.LIZ(new C1672606gm(systemContent, c0zqz, iLIZ, 0, c869590Y9l, c1622306Wv, C069P.LIZ().LJ().LJ(String.valueOf(c869590Y9l.getSender()), c869590Y9l.getSecSender()), ((C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue()).LL));
            IIMDebugService.LIZ.getClass();
            IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
            if (iIMDebugService != null && iIMDebugService.LIZJ()) {
                LJJIJL().setOnLongClickListener(new ViewOnLongClickListenerC1767306w3(this, c06xo2, 1));
            }
            EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJL.getValue();
            if (easterEggShareMessageAnimatorAbility != null) {
                easterEggShareMessageAnimatorAbility.LIZ(LJJIJL(), EnumC432220GxA.INLINE);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C06XO c06xo) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C06XO c06xo) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
