package com.ss.android.ugc.aweme.topic.book.creator;

import X.C01GW;
import X.C08JS;
import X.C098200Yq;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13LP;
import X.C1440005kM;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1799610wvn;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C452501pT;
import X.C723850SaN;
import X.EnumC1430380nKG;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.ItemSelectAbility;
import com.ss.android.ugc.aweme.prefab.ability.SubmitAbility;
import com.ss.android.ugc.aweme.topic.book.anchors.BookAnchorContent;
import com.ss.android.ugc.aweme.topic.book.model.BookDetail;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class BookSearchPage extends DetailBaseFragment implements SubmitAbility, TopicSearchListAssem.TopicSelectedAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwHELIOSZicjJiR9KzcpKDs8OmsOJiA4GyAtOyw7GCQrLA==";
    public String LLIZ;
    public int LLIZLLLIL = 5;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 65));
    public final Map<String, BookDetail> LLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "book_search_page";
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.SubmitAbility
    public final void Xj() {
        List<String> urlList;
        Collection<BookDetail> collectionValues = ((LinkedHashMap) this.LLJI).values();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("anchor_type", "book");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((BookDetail) it2.next()).id);
        }
        c2344009Gk.LJFF("book_id", C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63));
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((BookDetail) it3.next()).title);
        }
        c2344009Gk.LJFF("book_title", C13LP.LJJLIIIJ(arrayList2, null, null, null, 0, null, null, 63));
        c2344009Gk.LIZJ(collectionValues.size(), "book_num");
        C20684815ws.LJIILLIIL("choose_anchor", c2344009Gk.LIZ);
        ArrayList<BookAnchorContent> arrayList3 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        for (BookDetail bookDetail : collectionValues) {
            String str = bookDetail.id;
            String str2 = bookDetail.title;
            UrlModel urlModel = bookDetail.cover;
            arrayList3.add(new BookAnchorContent(str, str2, (urlModel == null || (urlList = urlModel.getUrlList()) == null) ? null : (String) C13LP.LJJJLL(urlList), bookDetail.author, null, bookDetail.topicRating));
        }
        for (BookAnchorContent bookAnchorContent : arrayList3) {
            C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE(), C08JS.LIZLLL(bookAnchorContent), bookAnchorContent.bookName, "", 0, bookAnchorContent.bookId, null, true, "", "", Long.MAX_VALUE, "", "", true, null, null, null, null, 0, -1, null, null)));
        }
        SR();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.book.creator.BookSearchPage for r10v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            r7 = 0
            X.0Q7z r6 = X.C1558360qeg.LJFF(r10, r7)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.SubmitAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.SubmitAbility.class
            X.01wD r8 = X.C1558520qew.LIZ(r6, r0, r7)
            java.lang.String r5 = "Proxy instance not create from AbilityInvokeHandler"
            r9 = 0
            r4 = 1
            if (r8 != 0) goto L2b
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.SubmitAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.SubmitAbility.class
            X.C1558520qew.LJII(r6, r10, r0, r7, r7)
        L19:
            X.0Q7z r6 = X.C1558360qeg.LJFF(r10, r7)
            java.lang.Class<com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem$TopicSelectedAbility> r0 = com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility.class
            X.01wD r8 = X.C1558520qew.LIZ(r6, r0, r7)
            if (r8 != 0) goto L6e
            java.lang.Class<com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem$TopicSelectedAbility> r0 = com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility.class
            X.C1558520qew.LJII(r6, r10, r0, r7, r7)
            return
        L2b:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r8)     // Catch: java.lang.IllegalArgumentException -> L41
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L41
            if (r0 == 0) goto L3b
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L41
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L41
            r0.add(r10)     // Catch: java.lang.IllegalArgumentException -> L41
            goto L19
        L3b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L41
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L41
            throw r0     // Catch: java.lang.IllegalArgumentException -> L41
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.SubmitAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.SubmitAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.SubmitAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.SubmitAbility.class
            r2[r9] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r10)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto Lb9
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.SubmitAbility> r0 = com.ss.android.ugc.aweme.prefab.ability.SubmitAbility.class
            X.C1558520qew.LJII(r6, r1, r0, r7, r7)
            goto L19
        L6e:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r8)     // Catch: java.lang.IllegalArgumentException -> L84
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L84
            if (r0 == 0) goto L7e
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L84
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L84
            r0.add(r10)     // Catch: java.lang.IllegalArgumentException -> L84
            return
        L7e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L84
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L84
            throw r0     // Catch: java.lang.IllegalArgumentException -> L84
        L84:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem$TopicSelectedAbility> r0 = com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem$TopicSelectedAbility> r0 = com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility.class
            r2[r9] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r10)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r8)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto Lb1
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem$TopicSelectedAbility> r0 = com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility.class
            X.C1558520qew.LJII(r6, r1, r0, r7, r7)
            return
        Lb1:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility"
            r1.<init>(r0)
            throw r1
        Lb9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.SubmitAbility"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.book.creator.BookSearchPage.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility
    public final boolean uB0(String str) {
        return this.LLJI.containsKey(str);
    }

    @Override // com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem.TopicSelectedAbility
    public final boolean BI(TopicRawInfo topicRawInfo, boolean z) {
        String quantityString;
        Resources resources;
        if (z) {
            this.LLJI.put(String.valueOf(topicRawInfo.id), new BookDetail(topicRawInfo.id, topicRawInfo.title, topicRawInfo.authorName, null, topicRawInfo.cover, topicRawInfo.topicRating, null, null, null, topicRawInfo.isCollected));
            Map<String, BookDetail> map = this.LLJI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (true ^ ((List) this.LLJ.getValue()).contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.size() + ((List) this.LLJ.getValue()).size() > this.LLIZLLLIL) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    int i = this.LLIZLLLIL;
                    quantityString = resources.getQuantityString(2131755115, i, Integer.valueOf(i));
                } else {
                    quantityString = null;
                }
                c1389890mGx.LJIIJ(quantityString);
                c1389890mGx.LJIIJJI();
                C19719512Dh.LIZJ(this.LLJI).remove(topicRawInfo.id);
                return false;
            }
            ItemSelectAbility itemSelectAbility = (ItemSelectAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ItemSelectAbility.class, null);
            if (itemSelectAbility != null) {
                itemSelectAbility.kK0(this.LLJI.size());
            }
            return true;
        }
        C19719512Dh.LIZJ(this.LLJI).remove(topicRawInfo.id);
        ItemSelectAbility itemSelectAbility2 = (ItemSelectAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ItemSelectAbility.class, null);
        if (itemSelectAbility2 != null) {
            itemSelectAbility2.kK0(this.LLJI.size());
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 25), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        Integer numLIZJ;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(true);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        frameLayout.setId(R.id.ex3);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
