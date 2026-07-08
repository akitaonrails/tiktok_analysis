package com.ss.android.ugc.aweme.selector.creatorgroup;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226600i1a;
import android.content.Context;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CreatorGroupTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_creator_group_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1226600i1a c1226600i1a;
        if (!(abstractC1225780i0G instanceof C1226600i1a) || (c1226600i1a = (C1226600i1a) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1226600i1a) { // from class: X.0i1Z
            public final C1226600i1a LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1225700i08(this, this.LLJIJIL.LLJJIJIL) { // from class: X.0i1X
                    public final C1226580i1Y LLILZ;
                    public final C1226460i1M LLILZIL;
                    public final C01GW LLILZLL;

                    @Override // X.C1225700i08, X.InterfaceC1224490hyB
                    public final void LJIJ(C1224590hyL c1224590hyL) {
                        InterfaceC1226510i1R interfaceC1226510i1R;
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list;
                        C1224840hyk c1224840hyk;
                        List<C1224840hyk> list2;
                        final long jLongValue;
                        Long l;
                        C1224780hye c1224780hyeLJIILLIIL2;
                        Map<String, List<C1224840hyk>> map;
                        super.LJIJ(c1224590hyL);
                        if (!c1224590hyL.LJ && c1224590hyL.LIZIZ && c1224590hyL.LIZ == EnumC1227730i3P.MAIN && (interfaceC1226510i1R = this.LL.LIZ) != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null && (c1224840hyk = (C1224840hyk) C13LP.LJJJLL(list)) != null) {
                            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                            if (interfaceC1226510i1R2 == null || (c1224780hyeLJIILLIIL2 = interfaceC1226510i1R2.LJIILLIIL()) == null || (map = c1224780hyeLJIILLIIL2.LIZ) == null || (list2 = map.get(EnumC1226540i1U.TAB_KEY_LIVE_CREATOR_GROUP.getValue())) == null) {
                                list2 = C13BV.INSTANCE;
                            }
                            C1226460i1M c1226460i1M = this.LLILZIL;
                            String str = c1224840hyk.LLILZ;
                            c1226460i1M.getClass();
                            String strValueOf = String.valueOf(c1224840hyk.LLJI.get("conv_cn"));
                            String strValueOf2 = String.valueOf(c1224840hyk.LLJI.get("conv_index"));
                            IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
                            Integer numValueOf = null;
                            if (iIMChatDetailAnalytics != null) {
                                Pair[] pairArr = new Pair[8];
                                pairArr[0] = new Pair("enter_from", c1226460i1M.LIZ.LJIIIZ().LIZJ());
                                if (list2 != null) {
                                    numValueOf = Integer.valueOf(list2.size());
                                }
                                pairArr[1] = new Pair("pub_chat_list", String.valueOf(numValueOf));
                                pairArr[2] = new Pair("avl_pub_chat_list", String.valueOf(C1226460i1M.LIZ(list2)));
                                pairArr[3] = new Pair("conversation_id", str);
                                pairArr[4] = new Pair("chat_type", "fan_group");
                                pairArr[5] = new Pair("group_type", C1229100i5c.LJI(str));
                                pairArr[6] = new Pair("chat_num", strValueOf);
                                pairArr[7] = new Pair("chat_pos", strValueOf2);
                                iIMChatDetailAnalytics.LJFF("group_choose_page_click", pairArr, C0I0B.LJFF.LIZIZ());
                            }
                            final Context context = (Context) this.LLILZLL.getValue();
                            final String str2 = c1224840hyk.LLILZ;
                            Object obj = c1224840hyk.LLJI.get("conv_short_id");
                            if ((obj instanceof Long) && (l = (Long) obj) != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            final C1226850i1z c1226850i1z = this.LLILZ.LJIIIZ;
                            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(str2, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0i1f
                                @Override // X.InterfaceC863600XuI
                                public final void LIZIZ(C0YMW c0ymw) {
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
                                /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
                                /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
                                @Override // X.InterfaceC863600XuI
                                public final void onSuccess(C0Y8T c0y8t) {
                                    ?? arrayList;
                                    Integer numValueOf2;
                                    String str3;
                                    String str4;
                                    List<Integer> list3;
                                    Integer num;
                                    C0Y8T c0y8t2 = c0y8t;
                                    if (c0y8t2 != null) {
                                        String str5 = str2;
                                        Context context2 = context;
                                        C1226850i1z c1226850i1z2 = c1226850i1z;
                                        long j = jLongValue;
                                        List<Long> memberIds = c0y8t2.getMemberIds();
                                        if (memberIds != null) {
                                            arrayList = new ArrayList();
                                            Iterator<Long> it2 = memberIds.iterator();
                                            while (it2.hasNext()) {
                                                String string = it2.next().toString();
                                                if (string != null) {
                                                    arrayList.add(string);
                                                }
                                            }
                                        } else {
                                            arrayList = C13BV.INSTANCE;
                                        }
                                        int iLIZ = C0ZFW.LIZ.LIZ(c0y8t2) - arrayList.size();
                                        if (iLIZ < 0) {
                                            iLIZ = 0;
                                        }
                                        C1461005nk c1461005nk = C1461005nk.LIZ;
                                        if (c1461005nk != null) {
                                            numValueOf2 = Integer.valueOf(c1461005nk.LJFF(Long.valueOf(C461720I8s.LIZJ()), str5));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        C1527905yX.LIZ(numValueOf2);
                                        if (c1226850i1z2 == null || (str3 = c1226850i1z2.enterFrom) == null) {
                                            str3 = "chat";
                                        }
                                        if (c1226850i1z2 == null || (str4 = c1226850i1z2.enterMethod) == null) {
                                            str4 = "new_group_chat";
                                        }
                                        if (c1226850i1z2 != null) {
                                            list3 = c1226850i1z2.inviteTypeList;
                                            num = c1226850i1z2.timeRange;
                                        } else {
                                            list3 = null;
                                            num = null;
                                        }
                                        C1226960i2A c1226960i2A = new C1226960i2A(context2, str3, str4, str5, arrayList, iLIZ, C1226910i25.LIZIZ(list3, j, num, null, null), C1226680i1i.LJ(), false, false, null, null, null, null, 0.0f, 65280);
                                        C1227130i2R.LIZ.getClass();
                                        C1227130i2R.LJ(context2, c1226960i2A);
                                    }
                                }
                            });
                        }
                    }

                    @Override // X.C1225700i08, X.InterfaceC1224250hxn
                    public final void LJJJ(C1224790hyf c1224790hyf) {
                        InterfaceC1226510i1R interfaceC1226510i1R;
                        C1224780hye c1224780hyeLJIILLIIL;
                        Map<String, List<C1224840hyk>> map;
                        Set<String> setKeySet;
                        int size;
                        List<C1224840hyk> list;
                        InterfaceC1226510i1R interfaceC1226510i1R2;
                        if (c1224790hyf.LIZIZ != null && (interfaceC1226510i1R2 = this.LL.LIZ) != null) {
                            interfaceC1226510i1R2.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, Boolean.valueOf(!r2.isEmpty()), (String) null, (Boolean) null, (Boolean) null), true);
                        }
                        if (c1224790hyf.LIZ != null && (interfaceC1226510i1R = this.LLILLJJLI.LLILLL) != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (map = c1224780hyeLJIILLIIL.LIZ) != null && (setKeySet = map.keySet()) != null) {
                            for (Object obj : setKeySet) {
                                Map<String, List<C1224840hyk>> map2 = c1224790hyf.LIZ;
                                boolean z = false;
                                if (map2 != null && (list = map2.get(obj)) != null) {
                                    size = list.size();
                                } else {
                                    size = 0;
                                }
                                InterfaceC1226510i1R interfaceC1226510i1R3 = this.LL.LIZ;
                                if (interfaceC1226510i1R3 != null) {
                                    if (size > 0) {
                                        z = true;
                                    }
                                    interfaceC1226510i1R3.LJIIZILJ(z, true);
                                }
                            }
                        }
                    }

                    {
                        super(this, c1226580i1Y);
                        this.LLILZ = c1226580i1Y;
                        this.LLILZIL = new C1226460i1M(this);
                        this.LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3266));
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJJ);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1226600i1a);
                this.LLJIJIL = c1226600i1a;
            }
        };
    }
}
