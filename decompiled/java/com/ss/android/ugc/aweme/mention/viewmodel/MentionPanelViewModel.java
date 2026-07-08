package com.ss.android.ugc.aweme.mention.viewmodel;

import X.AnonymousClass0950;
import X.C05QR;
import X.C05QS;
import X.C05QT;
import X.C08SN;
import X.C08SO;
import X.C09IC;
import X.C09IR;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0Y8Y;
import X.C0YAE;
import X.C0YSQ;
import X.C0Z2F;
import X.C0ZDS;
import X.C0ZDX;
import X.C118300cf;
import X.C13BV;
import X.C13LP;
import X.C1400340mXo;
import X.C1461005nk;
import X.C1462005nu;
import X.C1505805uy;
import X.C15438062q;
import X.C1658206eS;
import X.C1727806pg;
import X.C1BNE;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C315630CYv;
import X.C315640CYw;
import X.C315650CYx;
import X.C461720I8s;
import X.C512301z7;
import X.C512401z8;
import X.C869590Y9l;
import X.C907030Zi9;
import X.C907050ZiB;
import X.C913140Zs0;
import X.InterfaceC1755906uD;
import X.InterfaceC876950Yaj;
import Y.AComparatorS503S0100000_4;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class MentionPanelViewModel extends ViewModel implements C05QR {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final String LL;
    public final String LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final String LLILZ;
    public final C0Z2F LLILZIL;
    public final C0ZDS LLILZLL;
    public final InterfaceC876950Yaj LLIZ;
    public final InterfaceC1755906uD LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;
    public final C2252331DDr LLJIJIL;
    public final C2252331DDr LLJILJIL;
    public final AnonymousClass0950 LLJILJILJ;
    public final C2252331DDr LLJILLL;
    public final AnonymousClass0950 LLJJ;
    public List<? extends IMUser> LLJJI;
    public Map<String, Long> LLJJIII;
    public List<String> LLJJIJI;
    public List<? extends IMUser> LLJJIJIIJIL;
    public final List<String> LLJJIJIL;
    public String LLJJJ;
    public volatile boolean LLJJJIL;
    public final int LLJJJJ;
    public final AwS618S0100000_4 LLJJJJJIL;

    public MentionPanelViewModel() {
        throw null;
    }

    public final List<IMUser> wQ2() {
        List<IMUser> listLJLIL;
        C0Y8Y coreInfo;
        boolean zLIZ = C1727806pg.LIZ.LIZ("group_chat_mention_all", this.LL, C461720I8s.LIZIZ(), false);
        String icon = null;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C315640CYw(this, null), 2);
        Set setLLIIJI = C13LP.LLIIJI(this.LLJJIJI);
        List<? extends IMUser> list = this.LLJJI;
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            if (C13LP.LJJJJ(iMUser.getUid(), setLLIIJI)) {
                arrayList.add(iMUser);
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS503S0100000_4(setLLIIJI, 0), arrayList);
        List listLL = C13LP.LL(this.LLIZLLLIL.LIZLLL(), this.LLJJJJ);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLL) {
            C869590Y9l c869590Y9l = (C869590Y9l) obj;
            if (!C0ZDX.LJJJJL(c869590Y9l) && !C0ZDX.LJJIJIL(c869590Y9l)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((C869590Y9l) it2.next()).getSender()));
        }
        final ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            List<? extends IMUser> list2 = this.LLJJI;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<? extends IMUser> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it3.next().getUid(), obj2)) {
                        if (!setLLIIJI.contains(obj2)) {
                            arrayList4.add(obj2);
                        }
                    }
                }
            }
        }
        List listLJLLLL2 = C13LP.LJLLLL(new C512301z7(new C512401z8(22), this, 2), C08SO.LIZ(new C08SN<String, String>() { // from class: X.07jr
            @Override // X.C08SN
            public final Iterator<String> LIZ() {
                return arrayList4.iterator();
            }

            @Override // X.C08SN
            public final String LIZIZ(String str) {
                return str;
            }
        }).entrySet());
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLJLLLL2, 10));
        Iterator it4 = listLJLLLL2.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Map.Entry) it4.next()).getKey());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            Iterator<? extends IMUser> it5 = this.LLJJI.iterator();
            while (true) {
                if (it5.hasNext()) {
                    IMUser next = it5.next();
                    if (Intrinsics.LJFF(next.getUid(), obj3)) {
                        if (next != null) {
                            arrayList6.add(next);
                        }
                    }
                }
            }
        }
        List<? extends IMUser> list3 = this.LLJJI;
        ArrayList arrayList7 = new ArrayList();
        for (IMUser iMUser2 : list3) {
            IMUser iMUser3 = iMUser2;
            if (!C13LP.LJJJJ(iMUser3.getUid(), setLLIIJI) && !C13LP.LJJJJ(iMUser3.getUid(), arrayList5)) {
                arrayList7.add(iMUser2);
            }
        }
        List listLJLIL2 = C13LP.LJLIL(C13LP.LJLLLL(new AComparatorS503S0100000_4(this, 1), arrayList7), arrayList6);
        if (zLIZ) {
            IMUser iMUser4 = new IMUser();
            iMUser4.setNickName(this.LLILLJJLI);
            iMUser4.setUid(CardStruct.IStatusCode.DEFAULT);
            UrlModel urlModel = new UrlModel();
            C0Y8T c0y8tLIZ = this.LLIZ.LIZ(this.LL);
            if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
                icon = coreInfo.getIcon();
            }
            urlModel.setUrlList(Collections.singletonList(icon));
            iMUser4.setAvatarThumb(urlModel);
            listLJLIL = C13LP.LJLIL(listLJLIL2, C13LP.LJLIL(listLJLLLL, Collections.singletonList(iMUser4)));
        } else {
            listLJLIL = C13LP.LJLIL(listLJLIL2, listLJLLLL);
        }
        this.LLJJIJIIJIL = listLJLIL;
        return listLJLIL;
    }

    public final void refresh() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZ, null, new C315650CYx(this, null), 2);
    }

    @Override // X.C05QR
    public final void WB2(String str) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C315630CYv(str, this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel.xQ2(java.lang.String):void");
    }

    public static boolean vQ2(String str, String str2) {
        boolean z;
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        C118300cf c118300cf = new C118300cf();
        for (int i = 0; i < str2.length(); i++) {
            Integer numValueOf = Integer.valueOf(a0.LJJIZ(str, str2.charAt(i), c118300cf.element, false, 4));
            if (numValueOf.intValue() >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!Boolean.valueOf(z).booleanValue()) {
                return false;
            }
            c118300cf.element = numValueOf.intValue() + 1;
        }
        return true;
    }

    public MentionPanelViewModel(String str, String str2, Map map) {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        C1461005nk c1461005nk = C1461005nk.LIZ;
        C0ZDS c0zds = C0ZDS.LIZ;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        C913140Zs0 c913140Zs0 = new C913140Zs0(C1505805uy.LIZ());
        c913140Zs0.setConversationId(str);
        c913140Zs0.setChatType(3);
        C907030Zi9.LJFF.getClass();
        InterfaceC1755906uD interfaceC1755906uDLIZ = C907050ZiB.LIZ().LIZ(c913140Zs0, true);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
        this.LLILZ = curUserId;
        this.LLILZIL = c1461005nk;
        this.LLILZLL = c0zds;
        this.LLIZ = interfaceC876950YajLIZIZ;
        this.LLIZLLLIL = interfaceC1755906uDLIZ;
        this.LLJ = C1BNE.LIZ(null);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.TRUE);
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = C09IR.LIZIZ(0, 0, null, 7);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILJIL = c2252331DDrLIZIZ;
        this.LLJILJILJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJILLL = c2252331DDrLIZIZ2;
        this.LLJJ = C09IC.LIZ(c2252331DDrLIZIZ2);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJI = c13bv;
        this.LLJJIII = C2097608Jq.LJ();
        this.LLJJIJI = c13bv;
        this.LLJJIJIIJIL = c13bv;
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = "";
        this.LLJJJJ = 20;
        if (c1461005nk == null) {
            c2252321DDqLIZ.setValue(Boolean.FALSE);
        } else {
            C1658206eS.LIZ(c1461005nk, str, this);
        }
        this.LLJJJJJIL = new AwS618S0100000_4(this, 56);
    }

    @Override // X.C05QR
    public final void Ys1(C05QT c05qt, String str, List list) {
        long sortOrder;
        IMUser iMUserLIZ;
        this.LLJI.setValue(Boolean.FALSE);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1462005nu c1462005nu = (C1462005nu) it2.next();
            if (!Intrinsics.LJFF(c1462005nu.getUid(), this.LLILZ) && (iMUserLIZ = C05QS.LIZ(c1462005nu)) != null) {
                arrayList.add(iMUserLIZ);
            }
        }
        this.LLJJI = arrayList;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C1462005nu c1462005nu2 = (C1462005nu) it3.next();
            String uid = c1462005nu2.getUid();
            if (uid == null) {
                uid = "";
            }
            C0YAE member = c1462005nu2.getMember();
            if (member != null) {
                sortOrder = member.getSortOrder();
            } else {
                sortOrder = 0;
            }
            Pair pair = new Pair(uid, Long.valueOf(sortOrder));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.LLJJIII = linkedHashMap;
        if (this.LLJJJIL) {
            xQ2(this.LLJJJ);
        } else {
            refresh();
        }
    }
}
