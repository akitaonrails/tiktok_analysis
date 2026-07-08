package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.AbstractC316870CbV;
import X.C0NOH;
import X.C13LP;
import X.C1421105hJ;
import X.C1697810uHb;
import X.C1728230v4f;
import X.C1728330v4p;
import X.C1728460v52;
import X.C1728720v5S;
import X.C1728950v5p;
import X.C1728990v5t;
import X.C1729250v6J;
import X.C1729280v6M;
import X.C1729870v7J;
import X.C1729980v7U;
import X.C1730010v7X;
import X.C1730290v7z;
import X.C2126308Ur;
import X.C23250099c;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1729810v7D;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateListViewModel extends AssemListViewModel<C1729870v7J, InterfaceC1891350zJl, Integer> {
    public final C1728950v5p LL = new C1728950v5p();
    public final C1728230v4f LLILLJJLI = new C1728230v4f();
    public final C1730010v7X LLILLL;
    public final C1728330v4p LLILZ;
    public InterfaceC1729810v7D LLILZIL;
    public final HashSet<String> LLILZLL;
    public C0NOH LLIZ;
    public C0NOH LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public TemplateItem LLJILJILJ;
    public boolean LLJILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1729870v7J(0);
    }

    public TemplateListViewModel() {
        new C1728720v5S();
        this.LLILLL = new C1730010v7X();
        this.LLILZ = new C1728330v4p();
        this.LLILZLL = new HashSet<>();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS605S0100000_26(c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 342));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1729960v7S
            r4 = r10
            if (r0 == 0) goto L4c
            r9 = r11
            X.0v7S r9 = (X.C1729960v7S) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L52
            X.C155000ia.LIZIZ(r1)
        L23:
            if (r1 != 0) goto L2b
        L25:
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            X.0Cb8 r1 = X.C317290CcB.LIZIZ(r0)
        L2b:
            return r1
        L2c:
            X.C155000ia.LIZIZ(r1)
            X.0v7D r1 = r4.LLILZIL
            if (r1 == 0) goto L25
            X.0v5t r0 = r1.Um1()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData r0 = r0.LL
            java.lang.String r5 = r0.roomId
            java.lang.String r6 = r0.authorId
            int r7 = r0.templateEntryType
            boolean r8 = r1.UG0()
            r9.LLILLL = r2
            java.lang.Object r1 = r4.wQ2(r5, r6, r7, r8, r9)
            if (r1 != r3) goto L23
            return r3
        L4c:
            X.0v7S r9 = new X.0v7S
            r9.<init>(r4, r11)
            goto L13
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final void xQ2(boolean z) {
        C1728990v5t c1728990v5tUm1;
        RootData rootData;
        String str;
        String str2;
        InterfaceC1729810v7D interfaceC1729810v7D = this.LLILZIL;
        if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null && (rootData = c1728990v5tUm1.LL) != null) {
            String str3 = rootData.roomId;
            String str4 = rootData.authorId;
            boolean z2 = rootData.isNewUser;
            if (z) {
                str = "display";
            } else {
                str = "cancel";
            }
            Map mapLIZ = C1729250v6J.LIZ(str3, str4, rootData.LIZ(), z2, "notice_board_template", null);
            mapLIZ.put("button_name", str);
            mapLIZ.put("module_name", "campaign_banner");
            if (Intrinsics.LJFF(str3, CardStruct.IStatusCode.DEFAULT)) {
                str2 = "before_live";
            } else {
                str2 = "during_live";
            }
            mapLIZ.put("live_status", str2);
            C1421105hJ.LIZJ("livesdk_tiktokec_button_click", mapLIZ);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        num.intValue();
        return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
    }

    public final void vQ2(ViewGroup viewGroup, TemplateItem templateItem) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C2126308Ur.LJFF, null, new C1729980v7U(viewGroup, templateItem, this, null), 2);
    }

    public final void yQ2(RootData rootData, TemplateItem templateItem) {
        TemplateDecoration templateDecoration;
        Integer num;
        if (!this.LLILZLL.contains(templateItem.getTemplateId())) {
            this.LLILZLL.add(templateItem.getTemplateId());
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = templateItem.getTemplateId();
            int type = templateItem.getType();
            boolean zLJJIZ = templateItem.LJJIZ();
            String strLIZ = rootData.LIZ();
            int i = rootData.templateEntryType;
            C1730290v7z.LIZ.getClass();
            boolean zLJIILJJIL = C1730290v7z.LJIILJJIL(templateItem);
            List<TemplateDecoration> listTc = templateItem.tc();
            String str3 = null;
            if (listTc != null && (templateDecoration = (TemplateDecoration) C13LP.LJJJLZIJ(0, listTc)) != null && (num = templateDecoration.decorationType) != null) {
                if (num.intValue() == 1) {
                    str3 = "suggested";
                } else if (num.intValue() == 2) {
                    str3 = "auto_filled";
                }
            }
            Map mapLIZ = C1729250v6J.LIZ(str, str2, strLIZ, z, "notice_board_template", Integer.valueOf(i));
            mapLIZ.put("template_id", templateId);
            mapLIZ.put("module_name", "template_display");
            mapLIZ.put("is_org_template", Integer.valueOf(!zLJJIZ ? 1 : 0));
            mapLIZ.put("template_type", Integer.valueOf(type));
            mapLIZ.put("is_suggested_template", Integer.valueOf(zLJIILJJIL ? 1 : 0));
            if (str3 != null) {
                mapLIZ.put("label_type", str3);
            }
            C1421105hJ.LIZJ("livesdk_tiktokec_module_show", mapLIZ);
        }
    }

    public final void zQ2(TemplateItem templateItem, boolean z) {
        boolean zD62;
        TemplateItem templateItem2;
        TemplateItem templateItemLIZ;
        boolean z2;
        InterfaceC1729810v7D interfaceC1729810v7D = this.LLILZIL;
        if (interfaceC1729810v7D != null) {
            zD62 = interfaceC1729810v7D.d62();
        } else {
            zD62 = false;
        }
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            int i = 0;
            for (Object obj : listListGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if ((interfaceC1891350zJl instanceof TemplateItem) && (templateItem2 = (TemplateItem) interfaceC1891350zJl) != null) {
                        if (Intrinsics.LJFF(templateItem2.getTemplateId(), templateItem.getTemplateId())) {
                            C1730290v7z c1730290v7z = C1730290v7z.LIZ;
                            Boolean boolValueOf = Boolean.valueOf(z);
                            if (!z && !zD62) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            TemplateItem templateItemLIZ2 = C1730290v7z.LIZ(c1730290v7z, templateItem2, boolValueOf, Boolean.valueOf(z2), null, null, null, 56);
                            if (templateItemLIZ2 != null) {
                                listSetItemAt(i, templateItemLIZ2);
                            }
                        } else if (!templateItem2.b0() && (templateItemLIZ = C1730290v7z.LIZ(C1730290v7z.LIZ, templateItem2, Boolean.FALSE, Boolean.valueOf(zD62), null, null, null, 56)) != null) {
                            listSetItemAt(i, templateItemLIZ);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void AQ2(Context context, TemplateItem templateItem, int i) {
        List<ITEM> listListGetAll;
        TemplateItem templateItemLJIIZILJ;
        C1728990v5t c1728990v5tUm1;
        if (templateItem != null && (listListGetAll = listGetAll()) != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (((TemplateItem) ((InterfaceC1891350zJl) it2.next())).getType() == templateItem.getType()) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            int type = templateItem.getType();
            if (type != 8) {
                if (type != 9) {
                    return;
                }
                BillboardGiveawayInfo billboardGiveawayInfoVI = templateItem.vI();
                if (billboardGiveawayInfoVI != null && billboardGiveawayInfoVI.activityStatus == i && this.LLJILJIL == i) {
                    return;
                }
                C1730290v7z.LIZ.getClass();
                templateItemLJIIZILJ = C1730290v7z.LJIIZILJ(templateItem, i);
                if (templateItemLJIIZILJ == null) {
                    return;
                }
                listSetItemAt(i2, templateItemLJIIZILJ);
                this.LLJILJIL = i;
            } else {
                BillboardActivityInfo activityInfo = templateItem.getActivityInfo();
                if (activityInfo != null && activityInfo.activityStatus == i && this.LLJIJIL == i) {
                    return;
                }
                C1730290v7z.LIZ.getClass();
                templateItemLJIIZILJ = C1730290v7z.LJIIZILJ(templateItem, i);
                if (templateItemLJIIZILJ == null) {
                    return;
                }
                listSetItemAt(i2, templateItemLJIIZILJ);
                this.LLJIJIL = i;
            }
            InterfaceC1729810v7D interfaceC1729810v7D = this.LLILZIL;
            if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null && context != null && !c1728990v5tUm1.LL.LIZIZ() && templateItem.b0()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                RootData rootData = c1728990v5tUm1.LL;
                C1730290v7z.LIZ.getClass();
                String strLJIIIZ = C1730290v7z.LJIIIZ();
                if (strLJIIIZ == null) {
                    strLJIIIZ = "";
                }
                C1728460v52.LIZJ(rootData, "notice_board_template", strLJIIIZ, "template_msg_update", "display_total");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C2126308Ur.LJFF, null, new C1729280v6M(this, context, templateItemLJIIZILJ, c1728990v5tUm1, jCurrentTimeMillis, null), 2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03c9  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(java.lang.String r26, java.lang.String r27, int r28, boolean r29, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r30) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.TemplateListViewModel.wQ2(java.lang.String, java.lang.String, int, boolean, X.05Vn):java.lang.Object");
    }
}
