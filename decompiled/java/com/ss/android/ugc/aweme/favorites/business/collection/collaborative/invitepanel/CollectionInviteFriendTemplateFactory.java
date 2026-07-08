package com.ss.android.ugc.aweme.favorites.business.collection.collaborative.invitepanel;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225590hzx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class CollectionInviteFriendTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "CollectionInviteFriend";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1225590hzx c1225590hzx;
        if (!(abstractC1225780i0G instanceof C1225590hzx) || (c1225590hzx = (C1225590hzx) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1225590hzx) { // from class: X.0hzy
            public final C1225590hzx LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                C1225590hzx c1225590hzx2 = this.LLJIJIL;
                return new C1225700i08(this, c1225590hzx2.LLJJJIL, c1225590hzx2.LLJI, c1225590hzx2.LLIZLLLIL) { // from class: X.0hz5
                    public final List<String> LLILZ;
                    public final Function1<List<C1224840hyk>, Unit> LLILZIL;

                    @Override // X.C1225700i08, X.InterfaceC1224300hxs
                    public final void LJJI() {
                        Function1<List<C1224840hyk>, Unit> function1;
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list;
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if (interfaceC1226510i1R == null || interfaceC1226510i1R.LJIILLIIL() == null) {
                            return;
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                        if ((interfaceC1226510i1R2 == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) == null || (list = c1224780hyeLJIILLIIL.LIZIZ) == null || list.isEmpty()) && (function1 = this.LLILZIL) != null) {
                            function1.invoke(C13BV.INSTANCE);
                        }
                    }

                    @Override // X.C1225700i08, X.InterfaceC1224490hyB
                    public final void LJIJ(C1224590hyL c1224590hyL) {
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list;
                        C1225590hzx c1225590hzx3;
                        Function1<List<C1224840hyk>, Unit> function1;
                        super.LJIJ(c1224590hyL);
                        if (c1224590hyL.LIZ == EnumC1227730i3P.MAIN && !c1224590hyL.LJ && c1224590hyL.LIZIZ) {
                            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                            if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                                AbstractC1225780i0G abstractC1225780i0GLJJJJLL = this.LLILLJJLI.LJJJJLL();
                                if ((abstractC1225780i0GLJJJJLL instanceof C1225590hzx) && (c1225590hzx3 = (C1225590hzx) abstractC1225780i0GLJJJJLL) != null && (function1 = c1225590hzx3.LLIZLLLIL) != null) {
                                    function1.invoke(list);
                                }
                            }
                            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                            if (interfaceC1226510i1R2 != null) {
                                interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
                    @Override // X.C1225700i08, X.InterfaceC1224250hxn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJJJ(X.C1224790hyf r12) {
                        /*
                            r11 = this;
                            java.util.List<X.0hyk> r4 = r12.LIZIZ
                            if (r4 != 0) goto L5
                            return
                        L5:
                            X.0hyw r0 = r11.LL
                            X.0i1R r3 = r0.LIZ
                            if (r3 == 0) goto L61
                            boolean r0 = r4.isEmpty()
                            r0 = r0 ^ 1
                            r2 = 0
                            if (r0 == 0) goto L62
                            java.util.ArrayList r5 = new java.util.ArrayList
                            r0 = 10
                            int r0 = X.C15438062q.LJIJJ(r4, r0)
                            r5.<init>(r0)
                            java.util.Iterator r1 = r4.iterator()
                        L23:
                            boolean r0 = r1.hasNext()
                            if (r0 == 0) goto L35
                            java.lang.Object r0 = r1.next()
                            X.0hyk r0 = (X.C1224840hyk) r0
                            java.lang.String r0 = r0.LLILZ
                            r5.add(r0)
                            goto L23
                        L35:
                            java.util.List<java.lang.String> r1 = r11.LLILZ
                            if (r1 == 0) goto L62
                            boolean r0 = r5.containsAll(r1)
                            if (r0 == 0) goto L45
                            boolean r0 = r1.containsAll(r5)
                            if (r0 != 0) goto L62
                        L45:
                            r0 = 1
                        L46:
                            r3.LJIIZILJ(r0, r2)
                            X.0hyM r5 = new X.0hyM
                            X.0i3P r6 = X.EnumC1227730i3P.MAIN
                            boolean r0 = r4.isEmpty()
                            r0 = r0 ^ 1
                            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
                            r8 = 0
                            r10 = 28
                            r9 = r8
                            r5.<init>(r6, r7, r8, r9, r10)
                            r3.LJIIJJI(r5, r2)
                        L61:
                            return
                        L62:
                            r0 = 0
                            goto L46
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1225050hz5.LJJJ(X.0hyf):void");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LLILZ = list;
                        this.LLILZIL = function1;
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224330hxv LJJJJJL() {
                final C1224340hxw c1224340hxw = this.LLJIJIL.LLJJIJIIJIL;
                return new C1225800i0I(this, c1224340hxw) { // from class: X.0i0J
                    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
                    public final void LJI(C1224840hyk c1224840hyk) {
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list;
                        super.LJI(c1224840hyk);
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if ((interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) == null || (list = c1224780hyeLJIILLIIL.LIZIZ) == null || list.isEmpty()) && c1224840hyk.LLJILLL) {
                            AbstractC1225770i0F abstractC1225770i0F = this.LLILLJJLI;
                            C1226680i1i.LIZLLL(abstractC1225770i0F, abstractC1225770i0F.LJJJJLL().LIZIZ().getString(2131847948));
                        }
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJJJ);
            }

            @Override // X.AbstractC1225770i0F
            public final C1224950hyv LJJJJLI() {
                return new C1224950hyv(this, this.LLJIJIL.LLJJJ.LIZIZ) { // from class: X.0hz6
                    public List<? extends IMUser> LLILZIL;
                    public List<C1224840hyk> LLILZ = C13BV.INSTANCE;
                    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(750));

                    public final List<AbstractC1223800hx4> LJJJJIZL(List<? extends IMContact> list) {
                        ArrayList arrayList;
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list2;
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list2 = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            Iterator<C1224840hyk> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(it2.next().LLILZ);
                            }
                        } else {
                            arrayList = null;
                        }
                        return C1226100i0m.LIZ(this.LLILLJJLI.LJJJJLL().LIZIZ(), arrayList, list);
                    }

                    @Override // X.C1224950hyv, X.InterfaceC1223590hwj
                    public final Object LJJIIZ(String str, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
                        List listLJIILLIIL = this.LLILZIL;
                        if (listLJIILLIIL == null) {
                            IMContactApi.LIZ.getClass();
                            listLJIILLIIL = C069P.LIZ().LJ().LJIILLIIL();
                            this.LLILZIL = listLJIILLIIL;
                        }
                        IMContactApi.LIZ.getClass();
                        List listLJIL = C069P.LIZ().LJ().LJIL(str, true, listLJIILLIIL);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listLJIL) {
                            if (!Intrinsics.LJFF(((BaseContact) obj).getUid(), this.LLILZLL.getValue())) {
                                arrayList.add(obj);
                            }
                        }
                        try {
                            List<AbstractC1223800hx4> listLJJJJIZL = LJJJJIZL(arrayList);
                            ArrayList<AbstractC1223800hx4> arrayList2 = new ArrayList();
                            for (AbstractC1223800hx4 abstractC1223800hx4 : listLJJJJIZL) {
                                if (abstractC1223800hx4 instanceof C1224840hyk) {
                                    arrayList2.add(abstractC1223800hx4);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                            for (AbstractC1223800hx4 abstractC1223800hx42 : arrayList2) {
                                C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_SEARCH_PAGE, "");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(((C1224840hyk) abstractC1223800hx42).LLJI);
                                linkedHashMap.put("is_search", true);
                                arrayList3.add(C1224840hyk.LIZ((C1224840hyk) abstractC1223800hx42, c1224850hyl, null, false, linkedHashMap, str, false, false, false, false, false, 63998));
                            }
                            this.LLILZ = arrayList3;
                            boolean zIsEmpty = arrayList3.isEmpty();
                            List listSingletonList = arrayList3;
                            if (zIsEmpty) {
                                listSingletonList = Collections.singletonList(new C1223810hx5(C1383370m6R.LIZ.getString(R.string.kgn)));
                            }
                            return new C1223660hwq(listSingletonList);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return new C1223680hws(e);
                        }
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1225590hzx);
                this.LLJIJIL = c1225590hzx;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
            @Override // X.AbstractC1225770i0F
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJJJZ(X.AbstractC1225650i03 r9) {
                /*
                    r8 = this;
                    super.LJJJJZ(r9)
                    boolean r1 = r9 instanceof X.C1225680i06
                    if (r1 == 0) goto L11
                    r0 = r9
                    X.0i06 r0 = (X.C1225680i06) r0
                    X.0hyk r0 = r0.LIZ
                    boolean r0 = r0.LLJILJILJ
                    if (r0 == 0) goto L11
                    return
                L11:
                    boolean r0 = r9 instanceof X.C1225690i07
                    if (r0 == 0) goto L96
                    java.lang.String r4 = "confirm"
                L17:
                    r5 = 0
                    r6 = 0
                    if (r1 == 0) goto L7b
                    X.0i06 r9 = (X.C1225680i06) r9
                    X.0hyk r1 = r9.LIZ
                    boolean r0 = r1.LLJILJIL
                    if (r0 != 0) goto L7b
                    java.lang.String r1 = r1.LLILZ
                L25:
                    r7 = 1
                    if (r1 == 0) goto L32
                    int r0 = r1.length()
                    if (r0 == 0) goto L32
                    java.util.List r5 = java.util.Collections.singletonList(r1)
                L32:
                    r0 = 5
                    kotlin.Pair[] r3 = new kotlin.Pair[r0]
                    X.0hzx r0 = r8.LLJIJIL
                    java.lang.String r2 = r0.LLILZ
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "enter_from"
                    r1.<init>(r2, r0)
                    r3[r6] = r1
                    X.0hzx r0 = r8.LLJIJIL
                    java.lang.String r2 = r0.LLJILLL
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "enter_type"
                    r1.<init>(r2, r0)
                    r3[r7] = r1
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "choose_user_ids"
                    r1.<init>(r5, r0)
                    r0 = 2
                    r3[r0] = r1
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "button_type"
                    r1.<init>(r4, r0)
                    r0 = 3
                    r3[r0] = r1
                    X.0hzx r0 = r8.LLJIJIL
                    int r0 = r0.LLJJ
                    java.lang.String r2 = java.lang.String.valueOf(r0)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "is_new_tag"
                    r1.<init>(r2, r0)
                    r0 = 4
                    r3[r0] = r1
                    java.lang.String r0 = "ttsocial_create_new_collection_sharewith_panel_click"
                    X.C20684815ws.LJIJI(r0, r3)
                    return
                L7b:
                    X.0i1R r0 = r8.LLILLL
                    if (r0 == 0) goto L94
                    X.0hye r0 = r0.LJIILLIIL()
                    if (r0 == 0) goto L94
                    java.util.List<X.0hyk> r0 = r0.LIZIZ
                    if (r0 == 0) goto L94
                    java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r0)
                    X.0hyk r0 = (X.C1224840hyk) r0
                    if (r0 == 0) goto L94
                    java.lang.String r1 = r0.LLILZ
                    goto L25
                L94:
                    r1 = r5
                    goto L25
                L96:
                    boolean r0 = r9 instanceof X.C1225670i05
                    if (r0 == 0) goto L9e
                    java.lang.String r4 = "back"
                    goto L17
                L9e:
                    if (r1 == 0) goto Lba
                    r0 = r9
                    X.0i06 r0 = (X.C1225680i06) r0
                    X.0hyk r0 = r0.LIZ
                    boolean r0 = r0.LLJILJIL
                    if (r0 == 0) goto Lb6
                    X.0hzx r0 = r8.LLJIJIL
                    java.util.List<java.lang.String> r0 = r0.LLJI
                    if (r0 == 0) goto Lb2
                    r0.clear()
                Lb2:
                    java.lang.String r4 = "cancel_choose_friend"
                    goto L17
                Lb6:
                    java.lang.String r4 = "choose_friend"
                    goto L17
                Lba:
                    boolean r0 = r9 instanceof X.C1225640i02
                    if (r0 == 0) goto Lc2
                    java.lang.String r4 = "search"
                    goto L17
                Lc2:
                    java.lang.String r4 = ""
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1225600hzy.LJJJJZ(X.0i03):void");
            }
        };
    }
}
