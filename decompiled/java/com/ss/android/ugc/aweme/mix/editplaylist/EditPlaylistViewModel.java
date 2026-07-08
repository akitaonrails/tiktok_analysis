package com.ss.android.ugc.aweme.mix.editplaylist;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C09JN;
import X.C0T0P;
import X.C1165730gRP;
import X.C1167390gU5;
import X.C1167410gU7;
import X.C1167470gUD;
import X.C1167550gUL;
import X.C1169360gXG;
import X.C11S5;
import X.C13BV;
import X.C13LP;
import X.C14EU;
import X.C15438062q;
import X.C1559260qg8;
import X.C1623706Xj;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.EnumC1163900gOS;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC420801kM;
import Y.AfS154S0200000_18;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS126S0101000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS69S1000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class EditPlaylistViewModel extends AssemListViewModel<C1167470gUD, InterfaceC1891350zJl, Long> {
    public long LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public ShareInfo LLJI;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1167550gUL.class, "edit_playlist_hierarchy_data_key"), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 541));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 540));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(199));
    public boolean LLJ = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1167470gUD(0);
    }

    public final void vQ2() {
        ArrayList arrayList;
        if (!xQ2().LJIIJ) {
            setStateImmediate(AFwS256S0000000_18.get$arr$(156));
            return;
        }
        if (((C1167470gUD) this.vmDispatcher.getState()).LLJ instanceof C1623706Xj) {
            return;
        }
        setStateImmediate(AFwS256S0000000_18.get$arr$(157));
        final C1167410gU7 c1167410gU7XQ2 = xQ2();
        final AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this, 539);
        AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(this, 144);
        if (c1167410gU7XQ2.LJIIJ) {
            c1167410gU7XQ2.LJIIJ = false;
            List listLJLJJLL = C13BV.INSTANCE;
            if (c1167410gU7XQ2.LJIJJLI) {
                List listLJLIL = C13LP.LJLIL(c1167410gU7XQ2.LJIIZILJ, c1167410gU7XQ2.LJIILIIL);
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
                Iterator it2 = ((ArrayList) listLJLIL).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Aweme) it2.next()).getAid());
                }
            } else {
                List<Aweme> list = c1167410gU7XQ2.LJIILIIL;
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = ((ArrayList) list).iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Aweme) it3.next()).getAid());
                }
                List<Aweme> list2 = c1167410gU7XQ2.LJIIZILJ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it4 = ((ArrayList) list2).iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((Aweme) it4.next()).getAid());
                }
                listLJLJJLL = C13LP.LJLJJLL(arrayList2);
            }
            if (!arrayList.isEmpty() || !listLJLJJLL.isEmpty() || !c1167410gU7XQ2.LJIIL.isEmpty() || !c1167410gU7XQ2.LJIIJJI.isEmpty()) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLJLJJLL, ",", null, null, 0, null, null, 62);
                final String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c1167410gU7XQ2.LJIIL, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(1053), 30);
                final String strLJJLIIIJ4 = C13LP.LJJLIIIJ(c1167410gU7XQ2.LJIIJJI, ",", null, null, 0, null, null, 62);
                MixFeedApi.LIZ.getClass();
                MixFeedApi mixFeedApiLIZ = C1169360gXG.LIZ();
                int operation = EnumC1163900gOS.VIDEOCOMMITCHANGES.getOperation();
                String str = c1167410gU7XQ2.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(strLJJLIIIJ);
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(strLJJLIIIJ2);
                sbLIZ2.append(']');
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('[');
                sbLIZ3.append(strLJJLIIIJ3);
                sbLIZ3.append(']');
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append('[');
                sbLIZ4.append(strLJJLIIIJ4);
                sbLIZ4.append(']');
                InterfaceC420801kM interfaceC420801kMLJJIIZ = mixFeedApiLIZ.manageMixFeed(operation, str, strLIZIZ, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ4), "", strLIZIZ2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0gU6
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        UrlModel cover;
                        int i;
                        int i2;
                        String str2;
                        Video video;
                        C1C7U.LIZ("PlaylistEditCacheRepo@c1c4.commitPlaylistEdit$4");
                        Function0<Unit> function0 = awS562S0100000_18;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        C1167410gU7 c1167410gU7 = c1167410gU7XQ2;
                        String str3 = c1167410gU7.LIZLLL;
                        String str4 = c1167410gU7.LIZ;
                        boolean z = !c1167410gU7.LJIIL.isEmpty();
                        C1167410gU7 c1167410gU72 = c1167410gU7XQ2;
                        int size = (int) ((c1167410gU72.LJ + ((long) c1167410gU72.LJIIL.size())) - ((long) c1167410gU7XQ2.LJIIJJI.size()));
                        C1167410gU7 c1167410gU73 = c1167410gU7XQ2;
                        Aweme aweme = (Aweme) C13LP.LJJJLL(C13LP.LJLIL(c1167410gU73.LJIIZILJ, c1167410gU73.LJIILIIL));
                        if (aweme != null && (video = aweme.getVideo()) != null) {
                            cover = video.getCover();
                        } else {
                            cover = null;
                        }
                        C1440005kM.LIZ(new C1167950gUz(str3, cover, Boolean.valueOf(z), str4, Integer.valueOf(size)));
                        C1167410gU7 c1167410gU74 = c1167410gU7XQ2;
                        int size2 = (int) ((c1167410gU74.LJ + ((long) c1167410gU74.LJIIL.size())) - ((long) c1167410gU7XQ2.LJIIJJI.size()));
                        C1167410gU7 c1167410gU75 = c1167410gU7XQ2;
                        if (c1167410gU75.LJIIIIZZ == 1) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        Set setLLIIJI = C13LP.LLIIJI(c1167410gU75.LJIIJJI);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1167410gU7 c1167410gU76 = c1167410gU7XQ2;
                        List listLJLIL2 = C13LP.LJLIL(c1167410gU76.LJIIZILJ, c1167410gU76.LJIILIIL);
                        ArrayList<Aweme> arrayList3 = new ArrayList();
                        for (Object obj2 : (ArrayList) listLJLIL2) {
                            if (!setLLIIJI.contains(((Aweme) obj2).getAid())) {
                                arrayList3.add(obj2);
                            }
                        }
                        for (Aweme aweme2 : arrayList3) {
                            String aid = aweme2.getAid();
                            if (aid != null) {
                                linkedHashMap.put(aid, aweme2);
                            }
                        }
                        for (Aweme aweme3 : c1167410gU76.LJIIL) {
                            String aid2 = aweme3.getAid();
                            if (aid2 != null) {
                                linkedHashMap.put(aid2, aweme3);
                            }
                        }
                        Collection collectionValues = linkedHashMap.values();
                        if (collectionValues.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator<T> it5 = collectionValues.iterator();
                            i2 = 0;
                            while (it5.hasNext()) {
                                if (((Aweme) it5.next()).isSubOnlyVideo() && (i2 = i2 + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                        C1167410gU7 c1167410gU77 = c1167410gU7XQ2;
                        String str5 = c1167410gU77.LIZLLL;
                        if (!Intrinsics.LJFF(c1167410gU77.LJII, "playlist_internal") && !Intrinsics.LJFF(c1167410gU7XQ2.LJII, "profile_playlist_entrance")) {
                            str2 = c1167410gU7XQ2.LJI;
                        } else {
                            str2 = "playlist";
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        Integer numValueOf2 = Integer.valueOf(size2);
                        Integer numValueOf3 = Integer.valueOf(i);
                        c1169160gWw.getClass();
                        C1169160gWw.LJIILIIL(str5, str2, null, null, null, null, 0, numValueOf, numValueOf2, numValueOf3);
                        if (!c1167410gU7XQ2.LJIIL.isEmpty()) {
                            C1167410gU7 c1167410gU78 = c1167410gU7XQ2;
                            C1169160gWw.LJII(c1167410gU78.LJI, "edit_playlist_page", c1167410gU78.LIZLLL, Integer.valueOf(c1167410gU78.LJIIL.size()), Integer.valueOf(i2), Integer.valueOf(size2), Integer.valueOf(i), "add", strLJJLIIIJ3);
                        }
                        if (!c1167410gU7XQ2.LJIIJJI.isEmpty()) {
                            C1167410gU7 c1167410gU79 = c1167410gU7XQ2;
                            C1169160gWw.LJIJJLI(c1167410gU79.LJI, "edit_playlist_page", c1167410gU79.LIZLLL, strLJJLIIIJ4, Integer.valueOf(c1167410gU79.LJIIJJI.size()), Integer.valueOf(i2), Integer.valueOf(size2), Integer.valueOf(i));
                        }
                        C1C7U.LIZIZ("PlaylistEditCacheRepo@c1c4.commitPlaylistEdit$4");
                    }
                }, new AfS154S0200000_18(awS597S0100000_18, c1167410gU7XQ2, 29));
                if (interfaceC420801kMLJJIIZ != null) {
                    disposeOnClear(interfaceC420801kMLJJIIZ);
                    return;
                }
            }
        }
        setStateImmediate(AFwS256S0000000_18.get$arr$(158));
    }

    public final C1167550gUL wQ2() {
        return (C1167550gUL) this.LL.getValue();
    }

    public final C1167410gU7 xQ2() {
        return (C1167410gU7) this.LLILZ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AQ2() {
        C1167390gU5 c1167390gU5LIZIZ = xQ2().LIZIZ();
        int i = ((C1167470gUD) getState()).LLILZIL;
        int i2 = c1167390gU5LIZIZ.LIZ > 0 ? 1 : c1167390gU5LIZIZ.LIZIZ ? 0 : i;
        if (i2 != i) {
            C1167550gUL c1167550gULWQ2 = wQ2();
            if (c1167550gULWQ2 != null) {
                c1167550gULWQ2.LLIZ = i2;
            }
            xQ2().LJIIIIZZ = i2;
        }
        if (i2 == i && c1167390gU5LIZIZ.LIZ == ((C1167470gUD) getState()).LLILZLL && c1167390gU5LIZIZ.LIZIZ == ((C1167470gUD) getState()).LLIZ) {
            return;
        }
        setState(new AwS126S0101000_18(i2, c1167390gU5LIZIZ, 1));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 145));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlaylistRenameEvent(C0T0P c0t0p) {
        String str;
        String str2 = c0t0p.LIZIZ;
        C1167550gUL c1167550gULWQ2 = wQ2();
        if (c1167550gULWQ2 != null) {
            str = c1167550gULWQ2.LL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            setState(new AwS69S1000000_18(c0t0p.LIZ, 35));
            xQ2().LIZ = c0t0p.LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        if (this.LLIZLLLIL) {
            return zQ2(((C1167470gUD) getState()).LLILZ - 1, interfaceC1364105Vn);
        }
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    public final int yQ2(String str) {
        int i;
        C1167410gU7 c1167410gU7XQ2 = xQ2();
        Iterator it2 = ((ArrayList) c1167410gU7XQ2.LJIILIIL).iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((Aweme) it2.next()).getAid(), str)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i3);
        if (numValueOf.intValue() != -1) {
            return numValueOf.intValue() + 1;
        }
        Iterator it3 = ((ArrayList) c1167410gU7XQ2.LJIIZILJ).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((Aweme) it3.next()).getAid(), str)) {
                i = i2;
                break;
            }
            i2++;
        }
        return (c1167410gU7XQ2.LJFF - ((ArrayList) c1167410gU7XQ2.LJIIZILJ).size()) + Integer.valueOf(i).intValue() + 1;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadLatest(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return zQ2(l.longValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r23, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r25) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Type inference failed for: r8v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(long r18, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r20) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel.zQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(l.longValue(), interfaceC1364105Vn);
    }
}
