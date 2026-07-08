package com.ss.android.ugc.aweme.topic.review.list;

import X.C019F;
import X.C01D1;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C626710Oi5;
import X.C626730Oi7;
import X.C626790OiD;
import X.C724750Sbp;
import X.EnumC626900OiO;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicReviewListAssem extends DetailListAssem implements ViewPagerPageSelectedSubscriber {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicReviewListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewListVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TopicReviewListAssem.class, "topicReviewVM", "getTopicReviewVM()Lcom/ss/android/ugc/aweme/topic/review/vm/TopicReviewVM;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TopicReviewListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicReviewListVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1567), AFwS240S0000000_9.get$arr$(653), null, true);
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TopicReviewVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1568), AFwS240S0000000_9.get$arr$(654), null, true);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fw_;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public final TopicReviewListVM tp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (TopicReviewListVM) assemVMLazy.getValue();
    }

    public final void Bp() {
        C626790OiD c626790OiD = tp().LLILZ;
        if (c626790OiD.LIZJ) {
            for (Map.Entry entry : ((LinkedHashMap) c626790OiD.LIZ).entrySet()) {
                Object key = entry.getKey();
                long jCurrentTimeMillis = System.currentTimeMillis() - ((Number) entry.getValue()).longValue();
                HashMap<String, Long> map = c626790OiD.LIZIZ;
                Long l = map.get(key);
                map.put((String) key, Long.valueOf((l != null ? l.longValue() : 0L) + jCurrentTimeMillis));
            }
        }
        c626790OiD.LIZJ = false;
        C626790OiD c626790OiD2 = tp().LLILZ;
        Object obj = ((LinkedHashMap) tp().LLILLL).get("previous_page");
        String strLIZ = C626730Oi7.LIZ(tp().LLILLJJLI);
        String str = tp().LL;
        Object obj2 = ((LinkedHashMap) tp().LLILLL).get("topic_title");
        HashMap<String, Long> map2 = c626790OiD2.LIZIZ;
        for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            long jLongValue = entry2.getValue().longValue();
            C626710Oi5 c626710Oi5 = C626710Oi5.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c626710Oi5.getClass();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("enter_from", "topic_detail");
            pairArr[1] = new Pair("previous_page", obj);
            pairArr[2] = new Pair("category", strLIZ);
            pairArr[3] = new Pair("topic_id", str);
            pairArr[4] = new Pair("topic_title", obj2);
            pairArr[5] = new Pair("review_id", key2);
            pairArr[6] = new Pair("duration", lValueOf != null ? lValueOf.toString() : null);
            C20684815ws.LJIILLIIL("topic_review_duration", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(pairArr), linkedHashMap));
        }
        map2.clear();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Bp();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.review.list.TopicReviewListAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            r13 = this;
            r7 = r13
            super.onViewCreated(r14)
            X.15jv r3 = r7.mp()
            r2 = 1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell> r0 = com.ss.android.ugc.aweme.topic.review.list.TopicReviewCell.class
            r6 = 0
            r1[r6] = r0
            r3.LJIILJJIL(r1)
            X.0uv6 r3 = r7.lp()
            android.content.Context r1 = r14.getContext()
            r0 = 2131827867(0x7f111c9b, float:1.9288659E38)
            java.lang.String r0 = r1.getString(r0)
            r3.LJI = r0
            android.content.Context r1 = r14.getContext()
            r0 = 2131827866(0x7f111c9a, float:1.9288657E38)
            java.lang.String r0 = r1.getString(r0)
            r3.LJIIIIZZ = r0
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r7.LLJJJJ
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.topic.review.list.TopicReviewListAssem.LLJJJJJIL
            com.bytedance.assem.arch.viewModel.AssemViewModel r8 = r1.getValue()
            X.0OiI r9 = new X.C2217381BqS() { // from class: X.0OiI
                static {
                    /*
                        X.0OiI r0 = new X.0OiI
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0OiI) X.0OiI.LL X.0OiI
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626840OiI.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0Ohd> r3 = X.C626430Ohd.class
                        java.lang.String r2 = "getPublished()Lcom/bytedance/assem/arch/extensions/AssemEvent;"
                        r1 = 0
                        java.lang.String r0 = "published"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626840OiI.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0Ohd r2 = (X.C626430Ohd) r2
                        X.01Au<com.ss.android.ugc.aweme.topic.review.model.TopicReview> r0 = r2.LLILZLL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C626840OiI.get(java.lang.Object):java.lang.Object");
                }
            }
            r10 = 0
            kotlin.jvm.internal.AwS623S0100000_9 r11 = new kotlin.jvm.internal.AwS623S0100000_9
            r0 = 150(0x96, float:2.1E-43)
            r11.<init>(r7, r0)
            r12 = 6
            X.C736680Sv4.LJIIIIZZ(r7, r8, r9, r10, r11, r12)
            r7.yp()
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r7)
            if (r0 == 0) goto L61
            X.0Q7z r4 = X.C1558360qeg.LJFF(r0, r10)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.01wD r5 = X.C1558520qew.LIZ(r4, r0, r10)
            if (r5 != 0) goto L62
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.C1558520qew.LJII(r4, r7, r0, r10, r10)
        L61:
            return
        L62:
            java.lang.reflect.InvocationHandler r1 = java.lang.reflect.Proxy.getInvocationHandler(r5)     // Catch: java.lang.IllegalArgumentException -> L7a
            boolean r0 = r1 instanceof X.C2255108sX     // Catch: java.lang.IllegalArgumentException -> L7a
            if (r0 == 0) goto L72
            X.08sX r1 = (X.C2255108sX) r1     // Catch: java.lang.IllegalArgumentException -> L7a
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL     // Catch: java.lang.IllegalArgumentException -> L7a
            r0.add(r7)     // Catch: java.lang.IllegalArgumentException -> L7a
            return
        L72:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L7a
            java.lang.String r0 = "Proxy instance not create from AbilityInvokeHandler"
            r1.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L7a
            throw r1     // Catch: java.lang.IllegalArgumentException -> L7a
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            java.lang.ClassLoader r3 = r0.getClassLoader()
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            r2[r6] = r0
            X.08sX r1 = new X.08sX
            r1.<init>()
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r7)
            java.util.concurrent.CopyOnWriteArraySet<T extends X.01wD> r0 = r1.LL
            r0.add(r5)
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r3, r2, r1)
            if (r1 == 0) goto La7
            X.01wD r1 = (X.InterfaceC494301wD) r1
            java.lang.Class<com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber> r0 = com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber.class
            X.C1558520qew.LJII(r4, r1, r0, r10, r10)
            return
        La7:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.review.list.TopicReviewListAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void Pm0(int i, EnumC626900OiO enumC626900OiO) {
        if (i == 1) {
            C626790OiD c626790OiD = tp().LLILZ;
            c626790OiD.LIZJ = true;
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (Object obj : ((LinkedHashMap) c626790OiD.LIZ).keySet()) {
                c626790OiD.LIZ.put((String) obj, Long.valueOf(jCurrentTimeMillis));
            }
            return;
        }
        Bp();
    }
}
