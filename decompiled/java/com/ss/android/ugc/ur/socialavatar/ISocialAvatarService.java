package com.ss.android.ugc.ur.socialavatar;

import X.C0HDY;
import X.C0HFK;
import X.C0HFS;
import X.C0HFV;
import X.C0HHA;
import X.C0HXZ;
import X.C19EG;
import X.C364901bL;
import X.C427870Gq9;
import X.C437430HDh;
import X.EnumC437540HDs;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC427850Gq7;
import android.content.Context;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarFetchGeckoResourceLegoTask;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS331S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public interface ISocialAvatarService {
    Object LIZ(String str, String str2, InterfaceC1364105Vn<? super C364901bL> interfaceC1364105Vn);

    Object LIZIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LIZJ(String str, InterfaceC1364105Vn interfaceC1364105Vn);

    void LIZLLL(C0HFS c0hfs, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7);

    Object LJ(InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn);

    void LJFF(int i, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7);

    Object LJI(InterfaceC1364105Vn<? super SocialAvatarQueueStatusResult> interfaceC1364105Vn);

    Object LJII(Context context, C0HDY c0hdy, boolean z, boolean z2, C437430HDh c437430HDh, boolean z3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIIIIZZ();

    Object LJIIIZ(C0HFV c0hfv, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    SocialAvatarFetchGeckoResourceLegoTask LJIIJ();

    void LJIIJJI();

    AFwS331S0000000_6 LJIIL(C0HFK c0hfk);

    File LJIILIIL(String str);

    @InterfaceC1294060jmO
    void LJIILJJIL(String str, InterfaceC1631620sYq<? super Boolean, ? super C364901bL, ? super String, Unit> interfaceC1631620sYq);

    void LJIILL(C19EG c19eg, SocialAvatarDownloadArg socialAvatarDownloadArg);

    void LJIILLIIL(C0HHA c0hha, EnumC437540HDs enumC437540HDs, Function0<Unit> function0);

    void LJIIZILJ(C19EG c19eg, String str, String str2, C0HXZ c0hxz);
}
