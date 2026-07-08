package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0PEM;
import X.C1441805ke;
import X.C1559260qg8;
import X.C1750690vet;
import X.C1751140vfc;
import X.C1751230vfl;
import X.C1751260vfo;
import X.C1751300vfs;
import X.C1751310vft;
import X.C19EG;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C296580Bjs;
import X.C326210CqZ;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.C756302xN;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfoList;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SellerMessageListViewModel extends AssemListViewModel<C326210CqZ, InterfaceC1891350zJl, C1751300vfs> {
    public boolean LL;
    public volatile C1751260vfo LLILLJJLI;
    public WeakReference<C19EG> LLILZ;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723600SZy(this, C1751140vfc.class, null), true);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(68));
    public final C2252321DDq LLILZLL = C1BNE.LIZ(Boolean.FALSE);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326210CqZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        if (C296580Bjs.LIZ()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1441805ke(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List xQ2(java.util.List r34) {
        /*
            Y.AComparatorS45S0000000_26 r1 = new Y.AComparatorS45S0000000_26
            r0 = 1
            r1.<init>(r0)
            r0 = r34
            java.util.List r1 = X.C13LP.LJLLLL(r1, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r12.<init>(r0)
            java.util.Iterator r17 = r1.iterator()
        L1b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto Lb8
            java.lang.Object r1 = r17.next()
            X.0vft r1 = (X.C1751310vft) r1
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r1.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage> r0 = r0.messages
            if (r0 == 0) goto Lb5
            java.lang.Object r2 = X.C13LP.LJJLIIIJL(r0)
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage r2 = (com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage) r2
        L33:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r1.LIZIZ
            java.lang.Long r14 = r0.conId
            java.lang.String r13 = r0.name
            java.lang.String r11 = r0.imageUrl
            if (r2 == 0) goto Lb1
            java.lang.String r10 = r2.content
            java.lang.Long r0 = r2.createTime
            if (r0 == 0) goto Lb2
            long r15 = r0.longValue()
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r3 = r1.LIZIZ
            java.lang.Integer r9 = r3.unReadCount
            java.lang.String r8 = r3.clickUrl
            if (r2 == 0) goto Laf
            java.lang.Long r7 = r2.createTime
        L51:
            int r2 = r1.LIZ
            r0 = 4
            if (r2 != r0) goto Lac
            r27 = 1
        L58:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint r6 = r3.selling
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage> r5 = r3.messages
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.ext
            if (r2 == 0) goto Laa
            java.lang.String r0 = "seller_official_tag"
            java.lang.Object r4 = r2.get(r0)
            java.lang.String r4 = (java.lang.String) r4
        L68:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r1.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.ext
            if (r2 == 0) goto La8
            java.lang.String r0 = "seller_official_tag_url"
            java.lang.Object r3 = r2.get(r0)
            java.lang.String r3 = (java.lang.String) r3
        L76:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r1.LIZIZ
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.extTrackParams
            int r1 = r1.LIZ
            X.0vet r0 = new X.0vet
            java.lang.Long r23 = java.lang.Long.valueOf(r15)
            r34 = 0
            r26 = r7
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r3
            r32 = r2
            r33 = r1
            r22 = r10
            r24 = r9
            r25 = r8
            r19 = r14
            r20 = r11
            r21 = r13
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r12.add(r0)
            goto L1b
        La8:
            r3 = 0
            goto L76
        Laa:
            r4 = 0
            goto L68
        Lac:
            r27 = 0
            goto L58
        Laf:
            r7 = 0
            goto L51
        Lb1:
            r10 = 0
        Lb2:
            r15 = 0
            goto L47
        Lb5:
            r2 = 0
            goto L33
        Lb8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel.xQ2(java.util.List):java.util.List");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        ArrayList arrayList;
        C2252321DDq c2252321DDq = this.LLILZLL;
        List<InterfaceC1891350zJl> list = c627660Ojc.LLILZ;
        if (list != null) {
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof C1750690vet) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
        } else {
            arrayList = null;
        }
        c2252321DDq.setValue(Boolean.valueOf(C756302xN.LIZ(arrayList)));
        setState(new AwS605S0100000_26(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 192));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1751300vfs>> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1751230vfl(this, null));
    }

    public final List<C1751310vft> vQ2(List<ConversationInfoList> list) {
        List<ConversationInfo> list2;
        ArrayList arrayList = new ArrayList();
        for (ConversationInfoList conversationInfoList : list) {
            if (conversationInfoList != null && (list2 = conversationInfoList.conversationCoreInfos) != null) {
                Iterator<ConversationInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C1751310vft(conversationInfoList.LIZ, it2.next()));
                }
            }
        }
        C1751140vfc c1751140vfc = (C1751140vfc) this.LLILLL.getValue();
        if (c1751140vfc != null && c1751140vfc.LLJI) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C1751310vft) obj).LIZ != 4) {
                    arrayList2.add(obj);
                }
            }
            return new ArrayList(arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1751300vfs wQ2(C1751300vfs c1751300vfs, List list) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        C1751300vfs c1751300vfs2 = new C1751300vfs(15);
        boolean z = false;
        z = false;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ConversationInfoList conversationInfoList = (ConversationInfoList) it2.next();
                if (conversationInfoList != null) {
                    if (conversationInfoList.LIZ == 4) {
                        Integer num = conversationInfoList.nextCursor;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = c1751300vfs.LIZ + 10;
                        }
                        Object[] objArr = z ? 1 : 0;
                        c1751300vfs2 = C1751300vfs.LIZ(c1751300vfs2, iIntValue, z ? 1 : 0, objArr == true ? 1 : 0, z ? 1 : 0, 14);
                    } else if (conversationInfoList.LIZ == 1) {
                        Integer num2 = conversationInfoList.nextCursor;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = c1751300vfs.LIZIZ + 10;
                        }
                        C1751300vfs c1751300vfs3 = c1751300vfs2;
                        Object[] objArr2 = z ? 1 : 0;
                        z = z ? 1 : 0;
                        c1751300vfs2 = C1751300vfs.LIZ(c1751300vfs3, objArr2 == true ? 1 : 0, iIntValue2, z ? 1 : 0, z, 13);
                    } else if (conversationInfoList.LIZ == 6) {
                        Integer num3 = conversationInfoList.nextCursor;
                        if (num3 != null) {
                            iIntValue3 = num3.intValue();
                        } else {
                            iIntValue3 = c1751300vfs.LIZJ + 10;
                        }
                        Object[] objArr3 = z ? 1 : 0;
                        z = z ? 1 : 0;
                        c1751300vfs2 = C1751300vfs.LIZ(c1751300vfs2, objArr3 == true ? 1 : 0, z ? 1 : 0, iIntValue3, z, 11);
                    }
                }
            }
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ConversationInfoList conversationInfoList2 = (ConversationInfoList) it3.next();
                    if (conversationInfoList2 != null && Intrinsics.LJFF(conversationInfoList2.hasMore, Boolean.TRUE)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return C1751300vfs.LIZ(c1751300vfs2, 0, 0, 0, z, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: yQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1751300vfs r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1751300vfs>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1751270vfp
            if (r0 == 0) goto L52
            r3 = r7
            X.0vfp r3 = (X.C1751270vfp) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r2 = r3.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L63
            X.0vfs r6 = r3.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L42
            X.13BV r0 = X.C13BV.INSTANCE
        L2a:
            java.util.List r0 = r5.vQ2(r0)
            java.util.List r3 = xQ2(r0)
            X.0vfs r2 = wQ2(r6, r2)
            boolean r0 = r2.LIZLLL
            if (r0 == 0) goto L58
            X.0CcB r1 = X.AbstractC316870CbV.LIZ
            r0 = 0
            X.0Cm0 r0 = X.C317290CcB.LJ(r1, r0, r2, r3, r4)
            return r0
        L42:
            r0 = r2
            goto L2a
        L44:
            X.C155000ia.LIZIZ(r2)
            r3.LL = r6
            r3.LLILZ = r4
            java.lang.Object r2 = X.C1751250vfn.LIZ(r6, r3)
            if (r2 != r1) goto L24
            return r1
        L52:
            X.0vfp r3 = new X.0vfp
            r3.<init>(r5, r7)
            goto L12
        L58:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb8 r0 = new X.0Cb8
            r0.<init>(r3)
            return r0
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel.onLoadMore(X.0vfs, X.05Vn):java.lang.Object");
    }
}
