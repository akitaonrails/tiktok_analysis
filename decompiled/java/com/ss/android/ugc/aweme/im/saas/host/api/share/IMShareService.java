package com.ss.android.ugc.aweme.im.saas.host.api.share;

import X.C1371590lnR;
import X.C1371600lnS;
import X.C1372790lpN;
import X.C1608506Rn;
import X.C19EG;
import X.C869590Y9l;
import X.InterfaceC1369790lkX;
import X.InterfaceC1493505sz;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.saas.host.impl.share.CopyStreakLinkChannel;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.AwS53S1000000_2;

/* JADX INFO: loaded from: classes3.dex */
public interface IMShareService {
    public static final C1608506Rn LIZ = C1608506Rn.LIZ;

    void LIZ(Context context, BaseSharePackage baseSharePackage);

    void LIZIZ(Context context, Bundle bundle);

    void LIZJ(List<? extends C869590Y9l> list);

    boolean LIZLLL(View view, C869590Y9l c869590Y9l);

    void LJ(SharePackage sharePackage, IMContact iMContact, long j, InterfaceC1493505sz interfaceC1493505sz, int i);

    void LJFF(C869590Y9l c869590Y9l);

    void LJI(String str);

    boolean LJII(int i);

    void LJIIIIZZ(C869590Y9l c869590Y9l);

    boolean LJIIIZ();

    void LJIIJ(Activity activity, String str, C1372790lpN c1372790lpN, String str2, String str3);

    void LJIIJJI(int i, AwS53S1000000_2 awS53S1000000_2);

    void LJIIL(Activity activity, C1371590lnR c1371590lnR);

    CopyStreakLinkChannel LJIILIIL();

    void LJIILJJIL(C19EG c19eg, GroupSharePackage groupSharePackage);

    void LJIILL(boolean z);

    SharePackage LJIILLIIL(Context context, Aweme aweme, String str);

    TuxSheet LJIIZILJ(Activity activity, C1371590lnR c1371590lnR);

    void LJIJ(C19EG c19eg, C1371600lnS c1371600lnS);

    void LJIJI(int i);

    void LJIJJ(Context context, String str);

    void LJIJJLI(C1371600lnS c1371600lnS, Activity activity);

    void LJIL(C1371600lnS c1371600lnS, Activity activity);

    boolean LJJ(InterfaceC1369790lkX interfaceC1369790lkX);

    void LJJI(int i, AwS53S1000000_2 awS53S1000000_2);

    List<String> LJJIFFI();

    String LJJII(InterfaceC1369790lkX interfaceC1369790lkX, String str, String str2);

    String LJJIII(int i, String str, String str2, String str3);

    boolean LJJIIJ(IEvent iEvent);

    List<Long> getInternalShareSortedUids();
}
