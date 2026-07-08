package com.ss.android.ugc.aweme.contactselect;

import X.AbstractC1387200mCc;
import X.AnonymousClass0951;
import X.C05YW;
import X.C09IC;
import X.C1308910kAL;
import X.C1370905Yd;
import X.C13BV;
import X.C1557030qcX;
import X.C1557070qcb;
import X.C1683410tuN;
import X.C1683430tuP;
import X.C1683450tuR;
import X.C1683490tuV;
import X.C1683500tuW;
import X.C1683510tuX;
import X.C1683530tuZ;
import X.C1685850tyJ;
import X.C1687430u0r;
import X.C1692220u8a;
import X.C1692230u8b;
import X.C1693450uAZ;
import X.C1906580ziK;
import X.C1908030zkf;
import X.C1BNE;
import X.C2252321DDq;
import X.C414901jP;
import X.InterfaceC1665500tRU;
import X.InterfaceC1683460tuS;
import X.InterfaceC1683480tuU;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS155S0400000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes26.dex */
public final class ContactSelectViewModel extends ViewModel {
    public AwS155S0400000_27 LL;
    public int LLILLJJLI = 1;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final AnonymousClass0951 LLJI;
    public final C2252321DDq LLJIJIL;
    public final AnonymousClass0951 LLJILJIL;

    public ContactSelectViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1683510tuX.LIZ);
        this.LLILLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(C1557030qcX.LIZIZ);
        this.LLILZ = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(C1557070qcb.LIZ);
        this.LLILZIL = c2252321DDqLIZ3;
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(C13BV.INSTANCE);
        this.LLILZLL = c2252321DDqLIZ4;
        C2252321DDq c2252321DDqLIZ5 = C1BNE.LIZ("");
        this.LLIZ = c2252321DDqLIZ5;
        C414901jP c414901jP = new C414901jP(new InterfaceC346201Wa[]{c2252321DDqLIZ, c2252321DDqLIZ2, c2252321DDqLIZ3, c2252321DDqLIZ4, c2252321DDqLIZ5}, new C1683530tuZ(this, null));
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C05YW.LIZ.getClass();
        this.LLIZLLLIL = C09IC.LJJIJIL(c414901jP, viewModelScope, C1370905Yd.LIZIZ, C1683500tuW.LIZ);
        C2252321DDq c2252321DDqLIZ6 = C1BNE.LIZ(null);
        this.LLJ = c2252321DDqLIZ6;
        this.LLJI = C09IC.LIZIZ(c2252321DDqLIZ6);
        C2252321DDq c2252321DDqLIZ7 = C1BNE.LIZ(null);
        this.LLJIJIL = c2252321DDqLIZ7;
        this.LLJILJIL = C09IC.LIZIZ(c2252321DDqLIZ7);
    }

    public static String yQ2(IMContact iMContact) {
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (iMContact instanceof IMUser) {
            return iMContact.getUid();
        }
        return null;
    }

    public static InterfaceC1665500tRU xQ2(List list, List list2) {
        List<String> urlList;
        boolean zLJ;
        ArrayList<IMContact> arrayList = new ArrayList();
        for (Object obj : list2) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (Intrinsics.LJFF(yQ2((IMContact) next), obj)) {
                        if (next != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (IMContact iMContact : arrayList) {
            String strYQ2 = yQ2(iMContact);
            if (strYQ2 != null) {
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || (urlList = displayAvatar.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                String displayName = iMContact.getDisplayName();
                if (displayName == null) {
                    displayName = "";
                }
                if (iMContact instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact;
                    zLJ = C1908030zkf.LJ(iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason());
                } else {
                    zLJ = false;
                }
                arrayList2.add(new C1683450tuR(strYQ2, urlList, displayName, zLJ));
            }
        }
        return C1687430u0r.LIZ(arrayList2);
    }

    public static C1692220u8a vQ2(Context context, String str, int i, String str2) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C1692220u8a(str);
        }
        Locale locale = Locale.ROOT;
        int iLJJJ = a0.LJJJ(str.toLowerCase(locale), str2.toLowerCase(locale), 0, false, 6);
        if (iLJJJ == -1) {
            return new C1692220u8a(str);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -119723;
        }
        C1692230u8b c1692230u8b = new C1692230u8b();
        int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1685850tyJ.LIZIZ(iIntValue), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
        try {
            c1692230u8b.LIZLLL(str.substring(0, iLJJJ));
            c1692230u8b.LJII(iLJIIJJI);
            int iLJIIJJI2 = c1692230u8b.LJIIJJI(new C1693450uAZ(C1685850tyJ.LIZIZ(iIntValue2), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                c1692230u8b.LIZLLL(str.substring(iLJJJ, str2.length() + iLJJJ));
                c1692230u8b.LJII(iLJIIJJI2);
                iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1685850tyJ.LIZIZ(iIntValue), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    c1692230u8b.LIZLLL(str.substring(iLJJJ + str2.length()));
                    c1692230u8b.LJII(iLJIIJJI);
                    return c1692230u8b.LJIIL();
                } finally {
                }
            } finally {
            }
        } finally {
            TryCatchGuardChecker.doCheck(th);
            c1692230u8b.LJII(iLJIIJJI);
        }
    }

    public static InterfaceC1683460tuS wQ2(InterfaceC1683480tuU interfaceC1683480tuU, List list, List list2, String str) {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        List<String> urlList;
        C1692220u8a c1692220u8a;
        InterfaceC1683480tuU interfaceC1683480tuU2 = interfaceC1683480tuU;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean zLJ = false;
            if (!it2.hasNext()) {
                break;
            }
            IMContact iMContact = (IMContact) it2.next();
            String strYQ2 = yQ2(iMContact);
            if (strYQ2 != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
                UrlModel displayAvatar = iMContact.getDisplayAvatar();
                if (displayAvatar == null || (urlList = displayAvatar.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                String displayName = iMContact.getDisplayName();
                String str2 = "";
                if (displayName == null) {
                    displayName = "";
                }
                C1692220u8a c1692220u8aVQ2 = vQ2(activityLIZIZ, displayName, R.attr.a1h, str);
                boolean z = iMContact instanceof IMUser;
                if (z) {
                    String uniqueId = ((IMUser) iMContact).getUniqueId();
                    if (uniqueId != null) {
                        str2 = uniqueId;
                    }
                    c1692220u8a = vQ2(activityLIZIZ, str2, R.attr.a1k, str);
                } else if (iMContact instanceof IMConversation) {
                    IMConversation iMConversation = (IMConversation) iMContact;
                    c1692220u8a = new C1692220u8a(activityLIZIZ.getResources().getQuantityString(2131755366, iMConversation.getConversationMemberCount(), Integer.valueOf(iMConversation.getConversationMemberCount())));
                } else {
                    c1692220u8a = new C1692220u8a("");
                }
                boolean zContains = list2.contains(strYQ2);
                if (z) {
                    IMUser iMUser = (IMUser) iMContact;
                    zLJ = C1908030zkf.LJ(iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason());
                }
                arrayList.add(new C1683410tuN(strYQ2, urlList, c1692220u8aVQ2, c1692220u8a, zContains, zLJ));
            }
        }
        if (arrayList.isEmpty()) {
            return C1683490tuV.LIZ;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((C1683410tuN) it3.next()).LJ) {
                    interfaceC1683480tuU2 = C1683510tuX.LIZ;
                    break;
                }
            }
        }
        return new C1683430tuP(interfaceC1683480tuU2, arrayList);
    }
}
