package com.ss.android.ugc.profile.business.ur.alias;

import X.AbstractC848400XPy;
import X.C054G;
import X.C099G;
import X.C09A1;
import X.C0C59;
import X.C0PEM;
import X.C0XQ7;
import X.C1076010e6h;
import X.C1243340iSa;
import X.C1243350iSb;
import X.C1243360iSc;
import X.C1243370iSd;
import X.C1243380iSe;
import X.C1243400iSg;
import X.C1243410iSh;
import X.C1247000iYU;
import X.C1253000iiA;
import X.C1266010j39;
import X.C1388190mED;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LP;
import X.C14EU;
import X.C1653806dk;
import X.C1733306qZ;
import X.C1748440vbG;
import X.C19EG;
import X.C1DFH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097808Js;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C268500Afg;
import X.C343230Dcv;
import X.C376501dD;
import X.C384000F3u;
import X.C512401z8;
import X.C888460YtI;
import X.InterfaceC1243310iSX;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.ur.alias.AliasListResponse;
import com.ss.android.ugc.ur.alias.IAliasService;
import com.ss.android.ugc.ur.alias.UserAlias;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS53S0500000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class AliasServiceImpl implements IAliasService, LifecycleEventObserver {
    public final C054G LL;

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LIZ() {
        C1243370iSd.LIZ.getClass();
        C1243370iSd.LJ();
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LIZIZ() {
        C1243370iSd.LIZ.getClass();
        C1243370iSd.LIZIZ.clear();
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJFF() {
        C23250099c.LIZLLL(this.LL, null, null, new C1243360iSc(null), 3);
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJI() {
        C1243370iSd.LIZ.getClass();
        C1243370iSd.LJ();
    }

    public AliasServiceImpl() {
        EventBus.LIZLLL().LJIJJ(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1653806dk(this, null), 3);
        this.LL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final boolean LIZLLL() {
        if (!C1253000iiA.LIZ()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1243370iSd.LIZ.getClass();
        long j = jCurrentTimeMillis - C1243370iSd.LIZJ().getLong("alias_last_full_sync_timestamp", 0L);
        C0C59 c0c59LJ = C0C59.LJ();
        c0c59LJ.LJIILJJIL(0, false);
        return ((j > (c0c59LJ.LJII(0, 86400L, "alias_warm_start_duration", true) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) ? 1 : (j == (c0c59LJ.LJII(0, 86400L, "alias_warm_start_duration", true) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) ? 0 : -1)) > 0) && (C1243370iSd.LIZJ().getInt("has_given_alias_status", 0) != 2);
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final String LIZJ(String str) {
        Boolean bool;
        C1243370iSd.LIZ.getClass();
        if (C343230Dcv.LIZ()) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId != null && (bool = C1243370iSd.LIZJ.get(curUserId)) != null && bool.booleanValue()) {
                String str2 = C1243370iSd.LIZIZ.get(str);
                if (str2 != null && str2.length() != 0) {
                    return str2;
                }
            } else {
                Keva kevaLIZLLL = C1243370iSd.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("alias_of_");
                sbLIZ.append(str);
                return kevaLIZLLL.getString(C2188811AlT.LIZIZ(sbLIZ), null);
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJIIIZ(String str) {
        C1243370iSd.LIZ.getClass();
        C1243370iSd.LIZ(str);
        C1076010e6h.LIZJ.LIZIZ().LIZ().postValue(new C1243340iSa(str, ""));
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJIIJ(C1243410iSh c1243410iSh) {
        C1243400iSg.LIZ.getClass();
        C1243400iSg.LIZIZ(c1243410iSh);
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final Object fetchAliasList(InterfaceC1364105Vn<? super AliasListResponse> interfaceC1364105Vn) {
        return ((UserAliasApi) C1243350iSb.LIZ.getValue()).fetchAliasList(interfaceC1364105Vn);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        String uid;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (uid = user.getUid()) != null) {
            LJIIIZ(uid);
        }
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJIIIIZZ(AliasListResponse aliasListResponse, boolean z) {
        List<UserAlias> list;
        C1243370iSd.LIZ.getClass();
        C1243370iSd.LIZIZ(aliasListResponse, z);
        Pair[] pairArr = new Pair[2];
        int size = 0;
        pairArr[0] = new Pair("is_cold_start", "1");
        if (aliasListResponse != null && (list = aliasListResponse.userAlias) != null) {
            size = list.size();
        }
        pairArr[1] = new Pair("count", String.valueOf(size));
        C20684815ws.LJIILLIIL("alias_full_update", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (C1733306qZ.LIZ[event.ordinal()] == 1) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final C099G LJ(String str, long j, long j2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !((Boolean) C268500Afg.LIZ.getValue()).booleanValue()) {
            return null;
        }
        C1243370iSd.LIZ.getClass();
        ConcurrentHashMap<String, String> concurrentHashMap = C1243370iSd.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            if (a0.LJJIIZI(entry.getValue(), str, true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(C13LP.LL(C13LP.LJLLLL(new C512401z8(63), C2097808Js.LJIL(linkedHashMap)), 10));
        if (mapLJIILLIIL.isEmpty()) {
            return null;
        }
        return C23250099c.LIZIZ(this.LL, null, null, new C376501dD(mapLJIILLIIL, j, j2, null), 3);
    }

    @Override // com.ss.android.ugc.ur.alias.IAliasService
    public final void LJII(User user, Context context, C1243410iSh c1243410iSh, InterfaceC1243310iSX interfaceC1243310iSX) {
        Window window;
        User user2;
        int i;
        C1243380iSe c1243380iSe = new C1243380iSe();
        c1243380iSe.LJ = user;
        boolean z = false;
        if (user != null) {
            C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
            c1748440vbG.setPlaceholderText(user.getNickname());
            c1748440vbG.LJIILLIIL(true);
            c1748440vbG.setSingleLine(true);
            if (C1247000iYU.LIZIZ(user) != null) {
                c1748440vbG.LLJLILLLLZIIL.setText(C1247000iYU.LIZIZ(user));
            }
            c1748440vbG.LIZ(new C1266010j39(c1243380iSe, c1748440vbG, 2));
            c1243380iSe.LIZJ = c1748440vbG;
        }
        C1748440vbG c1748440vbG2 = c1243380iSe.LIZJ;
        if (c1748440vbG2 != null && (user2 = c1243380iSe.LJ) != null) {
            C1397620mTQ c1397620mTQ = new C1397620mTQ(context);
            User user3 = c1243380iSe.LJ;
            if (user3 != null && C1247000iYU.LIZIZ(user3) != null) {
                i = 2131833181;
            } else {
                i = 2131824788;
            }
            c1397620mTQ.LJFF(i, new AwS53S0500000_19(c1748440vbG2, context, user2, c1243410iSh, interfaceC1243310iSX, 3));
            c1397620mTQ.LJII(2131824787, new AwS598S0100000_19(c1243410iSh, 823));
            c1243380iSe.LIZLLL = c1397620mTQ;
        }
        C1748440vbG c1748440vbG3 = c1243380iSe.LIZJ;
        C1397620mTQ c1397620mTQ2 = c1243380iSe.LIZLLL;
        if (c1748440vbG3 != null && c1397620mTQ2 != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (C1247000iYU.LIZIZ(user) != null) {
                z = true;
            }
            c1397580mTM.LJFF(C1253000iiA.LIZIZ(z));
            c1397580mTM.LIZ(2131824786);
            C384000F3u.LIZ(c1397580mTM, c1748440vbG3);
            c1397580mTM.LJIIL = c1397620mTQ2;
            c1397580mTM.LJ(new AwS228S0300000_19(c1243410iSh, c1748440vbG3, context, 34));
            c1397580mTM.LIZLLL(new AwS370S0200000_4(context, c1748440vbG3, 101));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (window = c19egLIZIZ.getWindow()) != null) {
                window.setSoftInputMode(3);
            }
        }
    }
}
