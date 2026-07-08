package com.bytedance.android.livesdk.util;

import X.AbstractC1143290frD;
import X.AbstractC1865700yeO;
import X.AbstractC20356314kz;
import X.C1143300frE;
import X.C1161920gLG;
import X.C176600m4;
import X.C19748512Ol;
import X.C19EG;
import X.C1AZW;
import X.C20361214lm;
import X.C20424814w2;
import X.C20425514w9;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C473410IhP;
import X.C520010KaN;
import X.C786410Ut5;
import X.C930940aKi;
import X.C948450amx;
import X.C979410bat;
import X.EnumC039700Cd;
import X.EnumC941710ac5;
import X.EnumC979240bac;
import X.InterfaceC1294060jmO;
import X.InterfaceC20354714kj;
import X.InterfaceC941720ac6;
import X.RunnableC20356014kw;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlayOptConfigSetting;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PlayEntityUtilKt {
    public static final boolean LJIIIZ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User owner = room != null ? room.getOwner() : null;
        return owner != null && UserService.getInstance().user().getCurrentUserId() == owner.getId();
    }

    public static final void LIZLLL(AbstractC20356314kz abstractC20356314kz) {
        String strLIZ = C979410bat.LIZ(402, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callOnEntityEnd, playEntity.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        abstractC20356314kz.LJJLIIIIJ(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final Context LJIIIIZZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return C520010KaN.LJJIJIIJI((Fragment) lifecycleOwner, true);
        }
        if (lifecycleOwner instanceof C19EG) {
            return (Context) lifecycleOwner;
        }
        if (lifecycleOwner instanceof Context) {
            return C520010KaN.LJJIIZI((Context) lifecycleOwner, true);
        }
        if (lifecycleOwner instanceof View) {
            return C520010KaN.LJJIJ((View) lifecycleOwner, true);
        }
        return C520010KaN.LJJIIZI(null, true);
    }

    public static final boolean LJIIJ(String str) {
        InterfaceC941720ac6 interfaceC941720ac6;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MIC_ABILITY_MANAGER");
        Boolean boolValueOf = null;
        if ((objLJIIIZ instanceof InterfaceC941720ac6) && (interfaceC941720ac6 = (InterfaceC941720ac6) objLJIIIZ) != null) {
            if (str == null) {
                str = "";
            }
            List<String> listLJIJJ = interfaceC941720ac6.LJIJJ(str);
            if (listLJIJJ != null) {
                boolValueOf = Boolean.valueOf(listLJIJJ.contains(((ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class)).IY()));
            }
        }
        return C176600m4.LIZIZ(boolValueOf);
    }

    public static final boolean LJIIJJI(DataChannel dataChannel) {
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final int LIZ(AbstractC20356314kz abstractC20356314kz, C20424814w2 c20424814w2) {
        if (!abstractC20356314kz.LJJJJJL(c20424814w2.LJII)) {
            String strLIZ = C979410bat.LIZ(154, abstractC20356314kz.LJJJIL().LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculateUIState, stateData=");
            sbLIZ.append(c20424814w2);
            sbLIZ.append(", uiEnableState=");
            sbLIZ.append(4);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return 4;
        }
        if (c20424814w2.LJI <= C20425514w9.LJ) {
            String strLIZ2 = C979410bat.LIZ(154, abstractC20356314kz.LJJJIL().LIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calculateUIState, stateData=");
            sbLIZ2.append(c20424814w2);
            sbLIZ2.append(", uiEnableState=0");
            C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return 0;
        }
        String strLIZ3 = C979410bat.LIZ(154, abstractC20356314kz.LJJJIL().LIZ);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("calculateUIState, stateData=");
        sbLIZ3.append(c20424814w2);
        sbLIZ3.append(", uiEnableState=");
        sbLIZ3.append(2);
        C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
        return 2;
    }

    public static final void LJIILL(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new PlayEntityUtilKt$observeLifecycleDestroy$1(function0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0150, code lost:
    
        r3.LIZ("illegal single '&’, '&&' expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0zFb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(java.lang.String r9, kotlin.jvm.internal.AwS645S0100000_31 r10, final kotlin.jvm.internal.AwS397S0200000_31 r11) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.PlayEntityUtilKt.LJIILIIL(java.lang.String, kotlin.jvm.internal.AwS645S0100000_31, kotlin.jvm.internal.AwS397S0200000_31):void");
    }

    public static final void LJ(AbstractC20356314kz abstractC20356314kz, int i, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj) {
        String strLIZ = C979410bat.LIZ(402, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callbackSettingPageDismiss, playEntity.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(i);
        sbLIZ.append(", playbookTask=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJFF(i, c20361214lm.LIZIZ);
        }
    }

    public static final void LJFF(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner) {
        String strLIZ = C979410bat.LIZ(414, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callbackSettingPagePrepareShow, playEntity.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        sbLIZ.append(", playbookTask=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJ();
        }
        if (C1143300frE.LJIIJJI() != null) {
            String strLIZ2 = C979410bat.LIZ(208, "PlayEntity");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("postShowSettingPageTimeOutRunnable, name=");
            sbLIZ2.append(abstractC20356314kz.LJJJIL().LIZ);
            AbstractC1143290frD.LJI(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        abstractC20356314kz.LJJL();
        RunnableC20356014kw runnableC20356014kw = new RunnableC20356014kw(abstractC20356314kz, c20361214lm, interfaceC20354714kj, lifecycleOwner);
        abstractC20356314kz.LLIZLLLIL = runnableC20356014kw;
        C786410Ut5.LJLIIL(LinkMicPlayOptConfigSetting.INSTANCE.entityShowSettingPageTimeOut(), C473410IhP.LIZ(), runnableC20356014kw);
    }

    public static final <T> void LIZJ(AbstractC20356314kz abstractC20356314kz, T t, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        if (t != null) {
            String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, t);
            String strLIZ = C979410bat.LIZ(329, "PLAYBOOK_UTIL");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callbackConfigChangeSuccess, playEntity.name=");
            sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
            sbLIZ.append(", newParamJsonStr=");
            sbLIZ.append(json);
            sbLIZ.append(", playbookTask=");
            sbLIZ.append(c20361214lm);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            if (interfaceC20354714kj != null) {
                interfaceC20354714kj.LIZIZ(c20361214lm.LIZIZ, json, z);
            }
            long j = c20361214lm.LIZIZ;
            for (InterfaceC20354714kj interfaceC20354714kj2 : abstractC20356314kz.LL) {
                String str = abstractC20356314kz.LJJJIL().LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("invokeOnConfigChangeSuccess, newJsonParams=");
                sbLIZ2.append(json);
                sbLIZ2.append(", stateId=");
                sbLIZ2.append(j);
                C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC20354714kj2.LIZIZ(j, json, z);
            }
        }
    }

    public static final void LJII(AbstractC20356314kz abstractC20356314kz, int i, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        String strLIZ = C979410bat.LIZ(376, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callbackSettingPageShowSuccess, playEntity.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(i);
        sbLIZ.append(", playbookTask=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        abstractC20356314kz.LJJL();
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJIIIIZZ(i, c20361214lm.LIZIZ);
        }
        if (z) {
            abstractC20356314kz.LJJLIIIIJ(1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Boolean] */
    public static final void LJIILJJIL(AbstractC1865700yeO abstractC1865700yeO, Map<String, Boolean> map, boolean z, C259800zU<Boolean> c259800zU, Function1<? super Boolean, Unit> function1) {
        boolean zLIZIZ = abstractC1865700yeO.LIZIZ(map);
        if (z) {
            if (zLIZIZ) {
                Boolean bool = c259800zU.element;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2)) {
                    function1.invoke(bool2);
                }
            }
        } else if (!Intrinsics.LJFF(c259800zU.element, Boolean.valueOf(zLIZIZ))) {
            function1.invoke(Boolean.valueOf(zLIZIZ));
        }
        c259800zU.element = Boolean.valueOf(zLIZIZ);
    }

    public static void LIZIZ(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, String str, long j, int i) {
        EnumC039700Cd enumC039700Cd;
        if ((i & 8) != 0) {
            enumC039700Cd = EnumC039700Cd.NORMAL;
        } else {
            enumC039700Cd = null;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            j = -1000;
        }
        String strLIZ = C979410bat.LIZ(348, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callbackConfigChangeFail, rule.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(enumC039700Cd);
        sbLIZ.append(", failMessage=");
        sbLIZ.append(str);
        sbLIZ.append(", playbookTask=");
        sbLIZ.append(c20361214lm);
        C1AZW.LJFF(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LIZJ(str, j);
        }
        long j2 = c20361214lm.LIZIZ;
        for (InterfaceC20354714kj interfaceC20354714kj2 : abstractC20356314kz.LL) {
            String str2 = abstractC20356314kz.LJJJIL().LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invokeConfigChangeFail, failReason=");
            sbLIZ2.append(enumC039700Cd);
            sbLIZ2.append(", stateId=");
            sbLIZ2.append(j2);
            sbLIZ2.append(", failMessage=");
            sbLIZ2.append(str);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC20354714kj2.LIZJ(str, j);
        }
    }

    public static final void LJIIL(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, Function0 function0, Function1 function1, boolean z) {
        InterfaceC941720ac6 interfaceC941720ac6;
        String strLIZ = C979410bat.LIZ(319, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callBackMutexHandleStart, playEntity.name=");
        sbLIZ.append(abstractC20356314kz.LJJJIL().LIZ);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        abstractC20356314kz.LJJLIIIIJ(2);
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MIC_ABILITY_MANAGER");
        if ((objLJIIIZ instanceof InterfaceC941720ac6) && (interfaceC941720ac6 = (InterfaceC941720ac6) objLJIIIZ) != null) {
            if (z) {
                C176600m4.LIZIZ(Boolean.valueOf(interfaceC941720ac6.LJIILIIL(abstractC20356314kz.LJJJIL().LIZ, new AwS559S0100000_15(function0, (Function0<Unit>) 553), new AwS126S0400000_31(abstractC20356314kz, (AbstractC20356314kz) c20361214lm, (C20361214lm) interfaceC20354714kj, (InterfaceC20354714kj) function1, (Function1<? super EnumC941710ac5, Unit>) 8))));
                return;
            } else {
                C176600m4.LIZIZ(Boolean.valueOf(interfaceC941720ac6.LIZJ(abstractC20356314kz.LJJJIL().LIZ, new AwS575S0100000_31(function0, (Function0<Unit>) 201), new AwS126S0400000_31(abstractC20356314kz, (AbstractC20356314kz) c20361214lm, (C20361214lm) interfaceC20354714kj, (InterfaceC20354714kj) function1, (Function1<? super EnumC941710ac5, Unit>) 9))));
                return;
            }
        }
        function0.invoke();
    }

    public static void LJI(AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, EnumC979240bac enumC979240bac, String str, long j, int i) {
        int i2 = i & 8;
        if ((i & 32) != 0) {
            j = -1000;
        }
        abstractC20356314kz.LJJL();
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJI(j);
        }
        abstractC20356314kz.LJJLIIIIJ(0);
    }
}
