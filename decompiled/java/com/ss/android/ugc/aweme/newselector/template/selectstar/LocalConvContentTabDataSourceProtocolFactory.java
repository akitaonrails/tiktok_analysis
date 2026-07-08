package com.ss.android.ugc.aweme.newselector.template.selectstar;

import X.AbstractC1225770i0F;
import X.C1223510hwb;
import X.C1225970i0Z;
import X.C1226200i0w;
import X.EnumC1226540i1U;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class LocalConvContentTabDataSourceProtocolFactory implements IContentTabDataSourceFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final EnumC1226540i1U getTabKey() {
        return EnumC1226540i1U.TAB_KEY_LOCAL_CONVERSATION;
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContentTabDataSourceFactory
    public final C1225970i0Z WT1(final AbstractC1225770i0F abstractC1225770i0F, C1223510hwb c1223510hwb) {
        final C1226200i0w c1226200i0w;
        if (!(c1223510hwb instanceof C1226200i0w) || (c1226200i0w = (C1226200i0w) c1223510hwb) == null) {
            return null;
        }
        return new C1225970i0Z(abstractC1225770i0F, c1226200i0w) { // from class: X.0i11
            public final EnumC1226540i1U LLILLL;
            public final AbstractC1225770i0F LLILZ;
            public final C1226200i0w LLILZIL;

            @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
            public final View LJ() {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LJJJJLL().LIZIZ()), R.layout.cj_, null, false);
                C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.h3a);
                if (c1749280vcc != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.my;
                    Drawable drawableLIZ = c0hti.LIZ(viewTd.getContext());
                    c1722300uv6.LIZJ = 2;
                    c1722300uv6.LIZ = drawableLIZ;
                    c1722300uv6.LJFF = 2131845368;
                    c1749280vcc.setStatus(c1722300uv6);
                }
                return viewTd;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v19 */
            /* JADX WARN: Type inference failed for: r1v20 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r1v4 */
            /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
            @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
            public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
                ArrayList<C0Y8T> arrayList;
                ?? arrayList2;
                ?? r1;
                IMConversation iMConversationLJII;
                C1224840hyk c1224840hyk;
                List<C0Y8T> list;
                C0Y6X c0y6xLJIIZILJ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIZILJ(Long.MAX_VALUE, Integer.MAX_VALUE, this.LLILZIL.LJIIIIZZ);
                String str = null;
                if (c0y6xLJIIZILJ != null && (list = c0y6xLJIIZILJ.LIZIZ) != null) {
                    arrayList = new ArrayList();
                    for (C0Y8T c0y8t : list) {
                        if (this.LLILZIL.LJIIIZ.invoke(c0y8t).booleanValue()) {
                            arrayList.add(c0y8t);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (C0Y8T c0y8t2 : arrayList) {
                        String str2 = "";
                        if (c0y8t2.isSingleChat()) {
                            String strValueOf = String.valueOf(C0YNP.LJII(c0y8t2.getConversationId()));
                            IMContactApi.LIZ.getClass();
                            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strValueOf, str, "im_inbox");
                            if (iMUserLJIIL != null) {
                                C1224850hyl c1224850hyl = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL.getValue());
                                EnumC1224830hyj enumC1224830hyj = EnumC1224830hyj.NORMAL;
                                UrlModel displayAvatar = iMUserLJIIL.getDisplayAvatar();
                                String displayName = iMUserLJIIL.getDisplayName();
                                if (displayName != null) {
                                    str2 = displayName;
                                }
                                c1224840hyk = new C1224840hyk(c1224850hyl, enumC1224830hyj, "private", c0y8t2.getConversationId(), displayAvatar, str2, iMUserLJIIL.getUniqueId(), true, true, C2097608Jq.LJIIJ(new Pair("index", C1489370orP.LIZ(iMUserLJIIL.getDisplayName())), new Pair("index_tag", "a_to_z"), new Pair("contact", iMUserLJIIL)), false, false, false, false, C1908030zkf.LJ(iMUserLJIIL.getCustomVerify(), iMUserLJIIL.getEnterpriseVerifyReason()), 31744);
                                arrayList3.add(c1224840hyk);
                            }
                        } else if (c0y8t2.isGroupChat()) {
                            IIMContactUtilService.LIZ.getClass();
                            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
                            if (iIMContactUtilServiceLIZ != null && (iMConversationLJII = iIMContactUtilServiceLIZ.LJII(c0y8t2)) != null) {
                                int conversationMemberCount = iMConversationLJII.getConversationMemberCount();
                                C1224850hyl c1224850hyl2 = new C1224850hyl(EnumC992630bwD.TYPE_CONTENT_PAGE, this.LLILLL.getValue());
                                EnumC1224830hyj enumC1224830hyj2 = EnumC1224830hyj.NORMAL;
                                UrlModel urlModelLIZIZ = C879390Yef.LIZIZ(c0y8t2);
                                String displayName2 = iMConversationLJII.getDisplayName();
                                if (displayName2 == null) {
                                    displayName2 = "";
                                }
                                String conversationId = c0y8t2.getConversationId();
                                String quantityString = this.LLILZ.LJJJJLL().LIZIZ().getResources().getQuantityString(2131755366, conversationMemberCount, Integer.valueOf(conversationMemberCount));
                                Pair[] pairArr = new Pair[3];
                                String displayName3 = iMConversationLJII.getDisplayName();
                                if (displayName3 != null) {
                                    str2 = displayName3;
                                }
                                pairArr[0] = new Pair("index", C1489370orP.LIZ(str2));
                                pairArr[1] = new Pair("index_tag", "a_to_z");
                                pairArr[2] = new Pair("contact", iMConversationLJII);
                                c1224840hyk = new C1224840hyk(c1224850hyl2, enumC1224830hyj2, "group", conversationId, urlModelLIZIZ, displayName2, quantityString, true, true, C2097608Jq.LJIIJ(pairArr), false, false, false, false, false, 31744);
                                arrayList3.add(c1224840hyk);
                            }
                        }
                        str = null;
                    }
                    r1 = arrayList3;
                    if (this.LLILZIL.LJI) {
                        List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0i12
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                boolean zIsLetter;
                                C1224840hyk c1224840hyk2 = (C1224840hyk) obj;
                                C1224840hyk c1224840hyk3 = (C1224840hyk) obj2;
                                String strLIZ = C1489370orP.LIZ(c1224840hyk2.LLILZLL);
                                String strLIZ2 = C1489370orP.LIZ(c1224840hyk3.LLILZLL);
                                Character chLJLLILLLL = C13LN.LJLLILLLL(strLIZ);
                                boolean zIsLetter2 = false;
                                if (chLJLLILLLL != null) {
                                    zIsLetter = Character.isLetter(chLJLLILLLL.charValue());
                                } else {
                                    zIsLetter = false;
                                }
                                Character chLJLLILLLL2 = C13LN.LJLLILLLL(strLIZ2);
                                if (chLJLLILLLL2 != null) {
                                    zIsLetter2 = Character.isLetter(chLJLLILLLL2.charValue());
                                }
                                if (zIsLetter) {
                                    if (!zIsLetter2) {
                                        return -1;
                                    }
                                } else if (zIsLetter2) {
                                    return 1;
                                }
                                if (Intrinsics.LJFF(strLIZ, strLIZ2)) {
                                    String str3 = c1224840hyk2.LLILZLL;
                                    Locale locale = Locale.ROOT;
                                    return str3.toLowerCase(locale).compareTo(c1224840hyk3.LLILZLL.toLowerCase(locale));
                                }
                                return strLIZ.compareTo(strLIZ2);
                            }
                        }, arrayList3);
                        r1 = listLJLLLL;
                        if (this.LLILZIL.LJII) {
                            arrayList2 = new ArrayList();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : listLJLLLL) {
                                Object obj2 = ((C1224840hyk) obj).LLJI.get("index");
                                Object arrayList4 = linkedHashMap.get(obj2);
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                    linkedHashMap.put(obj2, arrayList4);
                                }
                                ((List) arrayList4).add(obj);
                            }
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                Object key = entry.getKey();
                                Collection collection = (Collection) entry.getValue();
                                arrayList2.add(new C1223790hx3(String.valueOf(key), (C1223780hx2) null, 6));
                                arrayList2.addAll(collection);
                            }
                        }
                    }
                    return new C1223660hwq(r1);
                }
                arrayList2 = C13BV.INSTANCE;
                r1 = arrayList2;
                return new C1223660hwq(r1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1226200i0w);
                EnumC1226540i1U enumC1226540i1U = EnumC1226540i1U.TAB_KEY_LOCAL_CONVERSATION;
                this.LLILLL = enumC1226540i1U;
                this.LLILZ = abstractC1225770i0F;
                this.LLILZIL = c1226200i0w;
            }
        };
    }
}
