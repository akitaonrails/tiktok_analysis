package com.ss.android.ugc.profile.business.ur.editprofile.namesync;

import X.AbstractC19484711Kz;
import X.AbstractC848400XPy;
import X.C013C;
import X.C01GW;
import X.C04TD;
import X.C0XQ7;
import X.C1054540dY4;
import X.C11LG;
import X.C1215670hjx;
import X.C1215770hk7;
import X.C123100dR;
import X.C1231850iA3;
import X.C1231860iA4;
import X.C1231880iA6;
import X.C1231920iAA;
import X.C1231930iAB;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C985403tE;
import X.EnumC1216800hlm;
import X.InterfaceC1231950iAD;
import Y.ACallableS27S1000000_19;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS148S0400000_19;
import kotlin.jvm.internal.AwS25S2200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNameSyncServiceImpl implements ProfileNameSyncService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(740));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(422));

    public static ProfileNameSyncService LJI() {
        Object objLIZ = C04TD.LIZ(ProfileNameSyncService.class, false);
        return objLIZ != null ? (ProfileNameSyncService) objLIZ : new ProfileNameSyncServiceImpl();
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final boolean LIZ() {
        if (!((Boolean) this.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C1215770hk7.LIZ.getClass();
        Keva kevaLIZ = C1215770hk7.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("username_to_nickname_pop_up_shown_count");
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 3 && ((User) this.LIZIZ.getValue()).getNickNameModifyTs() == 0;
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final boolean LIZJ() {
        if (!((Boolean) this.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C1215770hk7.LIZ.getClass();
        Keva kevaLIZ = C1215770hk7.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nickname_to_username_pop_up_shown_count");
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 3 && ((User) this.LIZIZ.getValue()).getHandleModified() == 0;
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final C11LG LIZLLL(String str) {
        return AbstractC19484711Kz.LJIJI(new ACallableS27S1000000_19(str, this, 0));
    }

    public static Pair LJII(C1215670hjx c1215670hjx, Context context) {
        String string;
        String string2;
        if (c1215670hjx.LIZ) {
            if (c1215670hjx.LIZIZ == EnumC1216800hlm.USERNAME) {
                string2 = context.getResources().getString(2131845395);
            } else {
                string2 = context.getResources().getString(2131845393);
            }
            return new Pair(string2, Boolean.TRUE);
        }
        if (C123100dR.LIZ(c1215670hjx.LIZJ)) {
            return new Pair(c1215670hjx.LIZJ, Boolean.FALSE);
        }
        if (c1215670hjx.LIZIZ == EnumC1216800hlm.USERNAME) {
            string = context.getResources().getString(2131845398);
        } else {
            string = context.getResources().getString(2131845394);
        }
        return new Pair(string, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final void LIZIZ(Context context, String str, C1231850iA3 c1231850iA3) {
        String string = context.getResources().getString(2131845404, str);
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 17);
        C1231930iAB c1231930iAB = new C1231930iAB(context, new C1231920iAA(spannableStringBuilder, 2131845408, 2131845406));
        final C013C c013c = new C013C();
        c013c.element = true;
        c1231930iAB.setOnCheckedListener(new InterfaceC1231950iAD() { // from class: X.0iA8
            @Override // X.InterfaceC1231950iAD
            public final void LIZ(boolean z) {
                c013c.element = z;
            }
        });
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        C985403tE.LIZ(c1397580mTM, new AwS103S1200000_19(c1231850iA3, str, c013c, 5));
        c1397580mTM.LJIIJJI = new C1054540dY4(c1231930iAB);
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1231880iA6 c1231880iA6 = C1231880iA6.LIZ;
        boolean z = c013c.element;
        c1231880iA6.getClass();
        C1231880iA6.LJ(z);
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final void LJFF(Fragment fragment, List<C1215670hjx> list, Function0<Unit> function0) {
        String string;
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        if (!list.isEmpty() && list.size() <= 2) {
            if (list.size() == 1) {
                LJIIIIZZ(fragment, LJII((C1215670hjx) ListProtector.get(list, 0), context), 3000L, new AwS563S0100000_19(function0, (Function0<Unit>) 2242));
                return;
            }
            if (!((C1215670hjx) ListProtector.get(list, 0)).LIZ) {
                LJIIIIZZ(fragment, LJII((C1215670hjx) ListProtector.get(list, 0), context), 3000L, new AwS563S0100000_19(function0, (Function0<Unit>) 2243));
                return;
            }
            if (((C1215670hjx) ListProtector.get(list, 1)).LIZ) {
                if (((C1215670hjx) ListProtector.get(list, 0)).LIZIZ == EnumC1216800hlm.USERNAME) {
                    string = context.getResources().getString(2131845396);
                } else {
                    string = context.getResources().getString(2131845392);
                }
                LJIIIIZZ(fragment, new Pair(string, Boolean.TRUE), 3000L, new AwS563S0100000_19(function0, (Function0<Unit>) 2244));
                return;
            }
            LJIIIIZZ(fragment, LJII((C1215670hjx) ListProtector.get(list, 0), context), 1500L, new AwS148S0400000_19(this, (ProfileNameSyncServiceImpl) fragment, (Fragment) LJII((C1215670hjx) ListProtector.get(list, 1), context), (Pair<String, Boolean>) function0, (Function0<Unit>) 1));
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid sync results: size: ");
        sbLIZ.append(list.size());
        C1720106oR.LIZ("ProfileNameSyncServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIIIZZ(Fragment fragment, Pair pair, long j, Function0 function0) {
        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
        c1389890mGx.LJIIJ((CharSequence) pair.getFirst());
        c1389890mGx.LIZJ(function0);
        c1389890mGx.LIZLLL(j);
        if (((Boolean) pair.getSecond()).booleanValue()) {
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.a0i);
        }
        c1389890mGx.LJIIJJI();
    }

    @Override // com.ss.android.ugc.profile.business.ur.editprofile.namesync.ProfileNameSyncService
    public final void LJ(Context context, String str, String str2, C1231860iA4 c1231860iA4) {
        String string = context.getResources().getString(2131845403, str);
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), spannableStringBuilder.length() - length, spannableStringBuilder.length(), 17);
        C1231930iAB c1231930iAB = new C1231930iAB(context, new C1231920iAA(spannableStringBuilder, 2131845407, 2131845405));
        final C013C c013c = new C013C();
        c013c.element = true;
        c1231930iAB.setOnCheckedListener(new InterfaceC1231950iAD() { // from class: X.0iA9
            @Override // X.InterfaceC1231950iAD
            public final void LIZ(boolean z) {
                c013c.element = z;
            }
        });
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        C985403tE.LIZ(c1397580mTM, new AwS25S2200000_19(c013c, c1231860iA4, str, str2, 2));
        c1397580mTM.LJIIJJI = new C1054540dY4(c1231930iAB);
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1231880iA6.LIZ.getClass();
        C1231880iA6.LIZLLL(str2, true);
    }
}
