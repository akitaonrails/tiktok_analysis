package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel;

import X.AbstractC879060Ye8;
import X.AnonymousClass0616;
import X.AnonymousClass0622;
import X.AnonymousClass0629;
import X.C01GW;
import X.C06W8;
import X.C06W9;
import X.C06WA;
import X.C06WF;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1693606kA;
import X.C1693806kC;
import X.C1693906kD;
import X.C1694106kF;
import X.C1694206kG;
import X.C1694306kH;
import X.C1694406kI;
import X.C1694506kJ;
import X.C1694606kK;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C723600SZy;
import X.C912600Zr8;
import X.C985403tE;
import X.EnumC1684406ig;
import X.EnumC1705606m6;
import X.EnumC2244811Ctb;
import X.InterfaceC0148002o;
import X.InterfaceC1693306k7;
import X.InterfaceC497601wk;
import X.InterfaceC863600XuI;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS17S0010000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BotDetailViewModel extends AssemViewModel<C1694606kK> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, AnonymousClass0616.class, null), true);
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS546S0100000_2(this, 579));
    public final C01GW LLILLL = C1509305vX.LIZ(new AwS546S0100000_2(this, 580));
    public final C01GW LLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 578));
    public boolean LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C0Y8T c0y8t = (C0Y8T) this.LLILZ.getValue();
        boolean z = c0y8t != null && c0y8t.isMute();
        C0Y8T c0y8t2 = (C0Y8T) this.LLILZ.getValue();
        boolean z2 = c0y8t2 != null && c0y8t2.isStickTop();
        IMAIBotInfo iMAIBotInfoVQ2 = vQ2();
        boolean z3 = iMAIBotInfoVQ2 != null && iMAIBotInfoVQ2.suggestedReplySwitch == EnumC2244811Ctb.BOT_SWITCH_STATUS_ON.getValue();
        IMAIBotInfo iMAIBotInfoVQ22 = vQ2();
        return new C1694606kK(z, z2, z3, false, iMAIBotInfoVQ22 != null && iMAIBotInfoVQ22.autoReplySwitch == EnumC2244811Ctb.BOT_SWITCH_STATUS_ON.getValue(), false, false, null);
    }

    public final AnonymousClass0616 wQ2() {
        return (AnonymousClass0616) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        IMAIServiceAPI.LIZ.getClass();
        AnonymousClass0629.LIZ().LIZ().LJJIJIIJI(new C06WF(this, null));
        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
        AnonymousClass0616 anonymousClass0616WQ2 = wQ2();
        interfaceC1693306k7LIZ.LJIIJJI(anonymousClass0616WQ2 != null ? anonymousClass0616WQ2.getEnterFrom() : null);
    }

    public final IMAIBotInfo vQ2() {
        AnonymousClass0616 anonymousClass0616WQ2 = wQ2();
        if (anonymousClass0616WQ2 != null) {
            return anonymousClass0616WQ2.getBotInfo();
        }
        return null;
    }

    public final void yQ2(Activity activity) {
        EnumC1684406ig enterFrom;
        AnonymousClass0616 anonymousClass0616WQ2 = wQ2();
        if (anonymousClass0616WQ2 != null && (enterFrom = anonymousClass0616WQ2.getEnterFrom()) != null && enterFrom.isFromBotChat()) {
            setState(AFwS229S0000000_2.get$arr$(324));
        } else {
            if (activity == null) {
                return;
            }
            IMAIServiceAPI.LIZ.getClass();
            AnonymousClass0629.LIZ().LIZ().LJJIZ(activity, false);
        }
    }

    public final void xQ2(C06WA c06wa, Boolean bool, C19EG c19eg) {
        String toEnterFromMobValue;
        EnumC1684406ig enterFrom;
        String toEnterMethodMobValue;
        EnumC1684406ig enterFrom2;
        String str;
        EnumC1684406ig enterFrom3;
        EnumC1684406ig enterFrom4;
        long j = 0;
        if (Intrinsics.LJFF(c06wa, C1694206kG.LIZ)) {
            if (bool != null) {
                bool.booleanValue();
                this.LLILZIL = true;
                setState(new AwS581S0100000_2(bool, 395));
                IMAIServiceAPI.LIZ.getClass();
                InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
                AnonymousClass0616 anonymousClass0616WQ2 = wQ2();
                if (anonymousClass0616WQ2 != null) {
                    enterFrom4 = anonymousClass0616WQ2.getEnterFrom();
                } else {
                    enterFrom4 = null;
                }
                interfaceC1693306k7LIZ.LJJII(enterFrom4, bool.booleanValue());
                InterfaceC1693306k7 interfaceC1693306k7LIZ2 = AnonymousClass0629.LIZ().LIZ();
                IMAIBotInfo iMAIBotInfoVQ2 = vQ2();
                if (iMAIBotInfoVQ2 != null) {
                    j = iMAIBotInfoVQ2.id;
                }
                interfaceC1693306k7LIZ2.LJIILL(j, new AnonymousClass0622(bool, null, 2), new C1693906kD(bool, this, c19eg, null));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c06wa, C1694106kF.LIZ)) {
            if (bool == null) {
                return;
            }
            bool.booleanValue();
            this.LLILZIL = true;
            setState(new AwS581S0100000_2(bool, 392));
            IMAIServiceAPI.LIZ.getClass();
            InterfaceC1693306k7 interfaceC1693306k7LIZ3 = AnonymousClass0629.LIZ().LIZ();
            AnonymousClass0616 anonymousClass0616WQ22 = wQ2();
            if (anonymousClass0616WQ22 != null) {
                enterFrom3 = anonymousClass0616WQ22.getEnterFrom();
            } else {
                enterFrom3 = null;
            }
            interfaceC1693306k7LIZ3.LJIIIIZZ(enterFrom3, bool.booleanValue());
            InterfaceC1693306k7 interfaceC1693306k7LIZ4 = AnonymousClass0629.LIZ().LIZ();
            IMAIBotInfo iMAIBotInfoVQ22 = vQ2();
            if (iMAIBotInfoVQ22 != null) {
                j = iMAIBotInfoVQ22.id;
            }
            interfaceC1693306k7LIZ4.LJIILL(j, new AnonymousClass0622(null, bool, 1), new C1693806kC(bool, this, c19eg, null));
            return;
        }
        if (Intrinsics.LJFF(c06wa, C1694506kJ.LIZ)) {
            IMAIServiceAPI.LIZ.getClass();
            AnonymousClass0629.LIZ().LIZ().LJIILJJIL(EnumC1705606m6.INTERACTION_TYPE_INSIGHT, null, null);
            yQ2(c19eg);
            return;
        }
        if (Intrinsics.LJFF(c06wa, C1694406kI.LIZ)) {
            if (c19eg == null) {
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(c19eg.getString(2131848507));
            c1397580mTM.LIZIZ(c19eg.getString(2131848504));
            C985403tE.LIZ(c1397580mTM, new AwS368S0200000_2(c19eg, this, 80));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        final boolean zBooleanValue = false;
        if (Intrinsics.LJFF(c06wa, C06W8.LIZ)) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            setState(new AwS17S0010000_2(zBooleanValue, 10));
            ILogger.LIZ.getClass();
            ILogger iLoggerLIZ = C912600Zr8.LIZ();
            if (iLoggerLIZ != null) {
                String str2 = (String) this.LLILLJJLI.getValue();
                if (zBooleanValue) {
                    str = "on";
                } else {
                    str = "off";
                }
                iLoggerLIZ.LJFF(str2, str, "chat_mute_click", C0I0B.LJFF.LIZIZ());
            }
            AnonymousClass0616 anonymousClass0616WQ23 = wQ2();
            if (anonymousClass0616WQ23 != null) {
                IMAIServiceAPI.LIZ.getClass();
                AnonymousClass0629.LIZ().LIZ().LJIIL(anonymousClass0616WQ23.getEnterFrom(), zBooleanValue);
            }
            AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILLL.getValue();
            if (abstractC879060Ye8 == null) {
                return;
            }
            abstractC879060Ye8.LJIIIIZZ(zBooleanValue, new InterfaceC863600XuI<C0Y8T>() { // from class: X.06kd
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    this.LIZ.setState(new AwS17S0010000_2(zBooleanValue, 11));
                    IIMErrorUtils.LIZ.getClass();
                    IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                    if (iIMErrorUtilsLIZ != null) {
                        C0I0B.LJFF.LIZJ();
                        iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                    }
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C0Y8T c0y8t) {
                    this.LIZ.setState(new AwS581S0100000_2(c0y8t, 390));
                }
            });
            return;
        }
        if (Intrinsics.LJFF(c06wa, C06W9.LIZ)) {
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            InterfaceC497601wk assemVMScope = getAssemVMScope();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C1693606kA(zBooleanValue, this, c19eg, null), 2);
            return;
        }
        if (!Intrinsics.LJFF(c06wa, C1694306kH.LIZ) || c19eg == null) {
            return;
        }
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1693306k7 interfaceC1693306k7LIZ5 = AnonymousClass0629.LIZ().LIZ();
        AnonymousClass0616 anonymousClass0616WQ24 = wQ2();
        String str3 = "";
        if (anonymousClass0616WQ24 == null || (enterFrom2 = anonymousClass0616WQ24.getEnterFrom()) == null || (toEnterFromMobValue = enterFrom2.getToEnterFromMobValue()) == null) {
            toEnterFromMobValue = "";
        }
        AnonymousClass0616 anonymousClass0616WQ25 = wQ2();
        if (anonymousClass0616WQ25 != null && (enterFrom = anonymousClass0616WQ25.getEnterFrom()) != null && (toEnterMethodMobValue = enterFrom.getToEnterMethodMobValue()) != null) {
            str3 = toEnterMethodMobValue;
        }
        interfaceC1693306k7LIZ5.LJJIJL(c19eg, toEnterFromMobValue, str3);
    }
}
