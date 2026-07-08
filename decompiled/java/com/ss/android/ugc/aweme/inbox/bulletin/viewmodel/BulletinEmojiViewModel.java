package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AnonymousClass0505;
import X.C01GW;
import X.C09R9;
import X.C0OPR;
import X.C0OPX;
import X.C0ORD;
import X.C0ORF;
import X.C0OSZ;
import X.C0PEM;
import X.C1183604k6;
import X.C1203150hPl;
import X.C1274104yh;
import X.C13LE;
import X.C2127308Vb;
import X.C2127408Vc;
import X.C2296808zG;
import X.C23250099c;
import X.C427100Gou;
import X.C438530HHn;
import X.C452501pT;
import X.C620010OTn;
import X.C622890Obv;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiConfigItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiGroup;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiJsonConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiViewModel extends AssemViewModel<C0ORD> {
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C622890Obv.class));
    public final Map<AnonymousClass0505, InterfaceC420801kM> LLILLJJLI = new LinkedHashMap();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(505));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(504));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ORD(0);
    }

    public final void init() {
        C620010OTn.LIZ.getClass();
        BulletinEmojiJsonConfig bulletinEmojiJsonConfig = C620010OTn.LIZIZ().LIZJ;
        if (bulletinEmojiJsonConfig != null) {
            xQ2(bulletinEmojiJsonConfig);
            C0OPX.LJII("bulletin board show emoji gecko data success from cache");
        } else {
            setState(AFwS240S0000000_9.get$arr$(344));
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C438530HHn(this, null), 3);
        }
    }

    public final LinkedList<String> vQ2() {
        return (LinkedList) this.LLILLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator it2 = ((LinkedHashMap) this.LLILLJJLI).entrySet().iterator();
        while (it2.hasNext()) {
            ((InterfaceC420801kM) ((Map.Entry) it2.next()).getValue()).dispose();
        }
        ((LinkedHashMap) this.LLILLJJLI).clear();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2127308Vb(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2127408Vc(this, null), 3);
    }

    public final void xQ2(BulletinEmojiJsonConfig bulletinEmojiJsonConfig) {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!vQ2().isEmpty()) {
            C620010OTn.LIZ.getClass();
            arrayList2.add(new C1203150hPl(new C1183604k6(C620010OTn.LIZLLL("Recently used")), C620010OTn.LJ("Recently used")));
            arrayList.add(new C1274104yh(C620010OTn.LJ("Recently used")));
            for (String str : vQ2()) {
                C620010OTn.LIZ.getClass();
                arrayList.add(new C427100Gou(str, null, C620010OTn.LJ("Recently used")));
            }
        }
        List<BulletinEmojiGroup> list2 = bulletinEmojiJsonConfig.group;
        if (list2 != null) {
            for (BulletinEmojiGroup bulletinEmojiGroup : list2) {
                if (bulletinEmojiGroup != null) {
                    String str2 = bulletinEmojiGroup.groupName;
                    if (str2 != null) {
                        C620010OTn.LIZ.getClass();
                        arrayList.add(new C1274104yh(C620010OTn.LJ(str2)));
                        arrayList2.add(new C1203150hPl(new C1183604k6(C620010OTn.LIZLLL(str2)), C620010OTn.LJ(str2)));
                    }
                    List<BulletinEmojiConfigItem> list3 = bulletinEmojiGroup.emojis;
                    if (list3 != null) {
                        for (BulletinEmojiConfigItem bulletinEmojiConfigItem : list3) {
                            if (bulletinEmojiConfigItem != null && (list = bulletinEmojiConfigItem.emoji) != null && (!list.isEmpty())) {
                                String str3 = (String) ((Map) this.LLILZ.getValue()).get(ListProtector.get(list, 0));
                                if (str3 == null) {
                                    str3 = (String) ListProtector.get(list, 0);
                                }
                                C620010OTn c620010OTn = C620010OTn.LIZ;
                                String str4 = bulletinEmojiGroup.groupName;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                c620010OTn.getClass();
                                arrayList.add(new C427100Gou(str3, list, C620010OTn.LJ(str4)));
                            }
                        }
                    }
                }
            }
        }
        setState(new AwS375S0200000_9(arrayList, (List<InterfaceC1891350zJl>) arrayList2, (List<C1203150hPl>) 49));
    }

    public final void wQ2(int i, long j, final long j2, C0OSZ c0osz, Integer num, final String str) {
        Object obj = new Object(j2, str) { // from class: X.0505
            public final long LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AnonymousClass0505)) {
                    return false;
                }
                AnonymousClass0505 anonymousClass0505 = (AnonymousClass0505) obj2;
                return this.LIZ == anonymousClass0505.LIZ && Intrinsics.LJFF(this.LIZIZ, anonymousClass0505.LIZIZ);
            }

            public final int hashCode() {
                return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
            }

            {
                this.LIZ = j2;
                this.LIZIZ = str;
            }
        };
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((LinkedHashMap) this.LLILLJJLI).get(obj);
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLILLJJLI.put((AnonymousClass0505) obj, ((C0ORF) this.LL.getValue().getOperator()).V(i, j, j2, c0osz, num, str));
        if (i == C0OPR.EMOJI_ACTION_TYPE_SEND.getType()) {
            vQ2().remove(str);
            if (vQ2().size() >= 12) {
                vQ2().removeLast();
            }
            vQ2().addFirst(str);
        }
    }
}
