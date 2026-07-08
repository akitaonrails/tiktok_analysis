package com.ss.android.ugc.aweme.pns.usercommunication.popupext;

import X.C15438062q;
import X.C2097908Jt;
import X.EnumC1914120zuU;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockFormat;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupAction;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupBlockFormat;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupBodyLink;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupElement;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupTransformer {
    public static final UniversalPopupTransformer LIZ = new UniversalPopupTransformer();

    public static UniversalPopupAction LIZ(NetworkUniversalPopupAction networkUniversalPopupAction) {
        EnumC1914120zuU enumC1914120zuU;
        String str = networkUniversalPopupAction.link;
        List<String> list = networkUniversalPopupAction.actionType;
        if (list.contains("sub_pop_up")) {
            enumC1914120zuU = EnumC1914120zuU.LINK_TYPE_POP;
        } else if (list.contains("upgrade")) {
            enumC1914120zuU = EnumC1914120zuU.LINK_TYPE_UPGRADE;
        } else if (list.contains("link_internal")) {
            enumC1914120zuU = EnumC1914120zuU.LINK_TYPE_INTERNAL;
        } else {
            if (list.contains("link_external")) {
                enumC1914120zuU = EnumC1914120zuU.LINK_TYPE_EXTERNAL;
            }
            String value = "";
            return new UniversalPopupAction(networkUniversalPopupAction.actionId, str, value, null, networkUniversalPopupAction.operation, networkUniversalPopupAction.dismiss, null, networkUniversalPopupAction.dismissAll, networkUniversalPopupAction.callback, networkUniversalPopupAction.actionType, null, networkUniversalPopupAction.isHighlighted(), networkUniversalPopupAction.defaultOn, 1096, null);
        }
        if (enumC1914120zuU == null || (value = enumC1914120zuU.getValue()) == null) {
            String value2 = "";
        }
        return new UniversalPopupAction(networkUniversalPopupAction.actionId, str, value2, null, networkUniversalPopupAction.operation, networkUniversalPopupAction.dismiss, null, networkUniversalPopupAction.dismissAll, networkUniversalPopupAction.callback, networkUniversalPopupAction.actionType, null, networkUniversalPopupAction.isHighlighted(), networkUniversalPopupAction.defaultOn, 1096, null);
    }

    public static UniversalPopupBlock LIZIZ(NetworkUniversalPopupBlock networkUniversalPopupBlock) {
        UniversalPopupBlockFormat universalPopupBlockFormat;
        UniversalPopupAction universalPopupActionLIZ;
        String str = networkUniversalPopupBlock.id;
        String str2 = networkUniversalPopupBlock.type;
        NetworkUniversalPopupBlockFormat networkUniversalPopupBlockFormat = networkUniversalPopupBlock.format;
        if (networkUniversalPopupBlockFormat != null) {
            universalPopupBlockFormat = new UniversalPopupBlockFormat(networkUniversalPopupBlockFormat.marginLeft, networkUniversalPopupBlockFormat.marginRight, networkUniversalPopupBlockFormat.marginTop, networkUniversalPopupBlockFormat.marginBottom, networkUniversalPopupBlockFormat.paddingLeft, networkUniversalPopupBlockFormat.paddingRight, networkUniversalPopupBlockFormat.paddingTop, networkUniversalPopupBlockFormat.paddingBottom, networkUniversalPopupBlockFormat.cornerRadius, networkUniversalPopupBlockFormat.cornerPosition);
        } else {
            universalPopupBlockFormat = null;
        }
        Map<String, NetworkUniversalPopupElement> map = networkUniversalPopupBlock.elements;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            UniversalPopupTransformer universalPopupTransformer = LIZ;
            NetworkUniversalPopupElement networkUniversalPopupElement = (NetworkUniversalPopupElement) entry.getValue();
            universalPopupTransformer.getClass();
            String str3 = networkUniversalPopupElement.subtype;
            String str4 = networkUniversalPopupElement.text;
            String str5 = networkUniversalPopupElement.font;
            String str6 = networkUniversalPopupElement.iconUrl;
            String str7 = networkUniversalPopupElement.iconUrlDark;
            String str8 = networkUniversalPopupElement.iconStyle;
            String str9 = networkUniversalPopupElement.align;
            List<NetworkUniversalPopupBodyLink> list = networkUniversalPopupElement.bodyLinks;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (NetworkUniversalPopupBodyLink networkUniversalPopupBodyLink : list) {
                String str10 = networkUniversalPopupBodyLink.text;
                String str11 = networkUniversalPopupBodyLink.font;
                String str12 = networkUniversalPopupBodyLink.color;
                boolean z = networkUniversalPopupBodyLink.hasChevron;
                String str13 = networkUniversalPopupBodyLink.icon;
                UniversalPopupTransformer universalPopupTransformer2 = LIZ;
                NetworkUniversalPopupAction networkUniversalPopupAction = networkUniversalPopupBodyLink.action;
                universalPopupTransformer2.getClass();
                arrayList.add(new UniversalPopupBodyLinkList(str10, str11, str12, str13, z, LIZ(networkUniversalPopupAction)));
            }
            linkedHashMap.put(key, new UniversalPopupBlockElement(str3, str4, str5, str6, str7, str8, str9, networkUniversalPopupElement.groupId, arrayList, LIZ(networkUniversalPopupElement.action)));
        }
        NetworkUniversalPopupAction networkUniversalPopupAction2 = networkUniversalPopupBlock.action;
        if (networkUniversalPopupAction2 != null) {
            universalPopupActionLIZ = LIZ(networkUniversalPopupAction2);
        } else {
            universalPopupActionLIZ = null;
        }
        return new UniversalPopupBlock(str2, str, null, null, null, Boolean.FALSE, null, null, null, universalPopupBlockFormat, linkedHashMap, universalPopupActionLIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b3  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse LIZJ(com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse r48) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pns.usercommunication.popupext.UniversalPopupTransformer.LIZJ(com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse):com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse");
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class StringMapDeserializer implements j<Map<String, ? extends String>> {
        @Override // com.google.gson.j
        public final Map<String, ? extends String> deserialize(k kVar, Type type, i iVar) {
            String string;
            n nVarLJIILIIL = kVar.LJIILIIL();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, k> entry : nVarLJIILIIL.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                if (value instanceof n) {
                    string = value.toString();
                } else if (value instanceof h) {
                    string = value.toString();
                } else if (value instanceof q) {
                    string = value.LJIL();
                } else if (value instanceof m) {
                    string = "null";
                } else {
                    string = value.toString();
                }
                linkedHashMap.put(key, string);
            }
            return linkedHashMap;
        }
    }
}
