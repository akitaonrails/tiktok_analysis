package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.emoji.analytics;

import X.C0I0B;
import X.C13KL;
import X.C13LP;
import X.C15438062q;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2534709wX;
import X.C453550HqT;
import X.C717610SCx;
import X.C717620SCy;
import X.C823170WQx;
import X.C830490Whz;
import X.EnumC451180Hme;
import X.InterfaceC1493105sv;
import X.InterfaceC1493505sz;
import Y.AComparatorS505S0100000_6;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes7.dex */
public final class IMEmojiAnalytics implements IIMEmojiAnalytics {
    public static final IMEmojiAnalytics LIZIZ = new IMEmojiAnalytics();
    public static final C823170WQx<String> LIZJ = new C823170WQx<>();
    public static final C823170WQx<String> LIZLLL = new C823170WQx<>();
    public static C830490Whz LJ;

    public static final class Service implements IIMEmojiAnalytics {
        public final /* synthetic */ IMEmojiAnalytics LIZIZ = IMEmojiAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
        public final String LIZ(Integer num) {
            return this.LIZIZ.LIZ(num);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
        public final void LIZIZ(String str, List<String> list, List<String> list2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(str, list, list2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
        public final void LIZJ(StickerItem stickerItem) {
            this.LIZIZ.LIZJ(stickerItem);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
        public final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, int i, List<String> list, List<String> list2, String str12, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZLLL(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11, i, list, list2, str12, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
    public final String LIZ(Integer num) {
        int type = EnumC451180Hme.ANIMATED.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC451180Hme.STATIC.getType();
            if (num != null && num.intValue() == type2) {
                return "sticker";
            }
            int type3 = EnumC451180Hme.VIDEO_STICKER_STATIC.getType();
            if (num == null || num.intValue() != type3) {
                int type4 = EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType();
                if (num != null && num.intValue() == type4) {
                    return "video_sticker";
                }
                int type5 = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                if (num != null && num.intValue() == type5) {
                    return "aimoji";
                }
                int type6 = EnumC451180Hme.GIPHY.getType();
                if (num == null || num.intValue() != type6) {
                    int type7 = EnumC451180Hme.THIRD_PARTY_GIPHY.getType();
                    if (num != null && num.intValue() == type7) {
                        return "giphy";
                    }
                    int type8 = EnumC451180Hme.THIRD_PARTY_TENOR.getType();
                    if (num == null || num.intValue() != type8) {
                        int type9 = EnumC451180Hme.INHOUSE_TENOR.getType();
                        if (num != null && num.intValue() == type9) {
                            return "tenor";
                        }
                        int type10 = EnumC451180Hme.PHOTO_STICKER.getType();
                        if (num != null && num.intValue() == type10) {
                            return "ugc_sticker";
                        }
                        int type11 = EnumC451180Hme.AISELF_STICKER.getType();
                        if (num != null && num.intValue() == type11) {
                            return "ai_self_sticker";
                        }
                        int type12 = EnumC451180Hme.AIGC_STICKER.getType();
                        if (num != null && num.intValue() == type12) {
                            return "ai_sticker";
                        }
                        int type13 = EnumC451180Hme.STREAK_STICKER.getType();
                        if (num != null && num.intValue() == type13) {
                            return "streak_sticker";
                        }
                        int type14 = EnumC451180Hme.PHOTO_COMMENT_STICKER.getType();
                        if (num != null && num.intValue() == type14) {
                            return "comment_sticker";
                        }
                        return "";
                    }
                    return "tenor";
                }
                return "giphy";
            }
            return "video_sticker";
        }
        return "sticker";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
    public final void LIZJ(StickerItem stickerItem) {
        String strLIZJ = C453550HqT.LIZJ(stickerItem);
        if (strLIZJ != null) {
            LIZJ.add(strLIZJ);
        }
        Long lLIZIZ = C453550HqT.LIZIZ(stickerItem);
        if (lLIZIZ != null) {
            LIZLLL.add(String.valueOf(lLIZIZ.longValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
    public final void LIZIZ(String str, List<String> list, List<String> list2, InterfaceC1493105sv interfaceC1493105sv) {
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        C823170WQx<String> c823170WQx = LIZJ;
        if (!c823170WQx.isEmpty()) {
            C830490Whz c830490Whz = LJ;
            if (c830490Whz != null) {
                int i = 16;
                if (list != null) {
                    C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    Iterator it2 = c717620SCyLLIIL.iterator();
                    while (true) {
                        C717610SCx c717610SCx = (C717610SCx) it2;
                        if (!c717610SCx.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                        Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                        linkedHashMap.put(pair.getFirst(), pair.getSecond());
                    }
                    C823170WQx<String> c823170WQx2 = LIZJ;
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : c823170WQx2) {
                        if (linkedHashMap.containsKey(str2)) {
                            arrayList.add(str2);
                        }
                    }
                    strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS505S0100000_6(linkedHashMap, 2), arrayList), ",", null, null, 0, null, null, 62);
                } else {
                    strLJJLIIIJ = C13LP.LJJLIIIJ(c823170WQx, ",", null, null, 0, null, null, 62);
                }
                c830490Whz.put("sticker_id_list", strLJJLIIIJ);
                if (str != null) {
                    c830490Whz.put("query_session_id", str);
                }
                C823170WQx<String> c823170WQx3 = LIZLLL;
                if (!c823170WQx3.isEmpty()) {
                    if (list2 != null) {
                        C717620SCy c717620SCyLLIIL2 = C13LP.LLIIL(list2);
                        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL2, 10));
                        if (iLIZIZ2 >= 16) {
                            i = iLIZIZ2;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                        Iterator it3 = c717620SCyLLIIL2.iterator();
                        while (true) {
                            C717610SCx c717610SCx2 = (C717610SCx) it3;
                            if (!c717610SCx2.hasNext()) {
                                break;
                            }
                            IndexedValue indexedValue2 = (IndexedValue) c717610SCx2.next();
                            Pair pair2 = new Pair(indexedValue2.LIZIZ, Integer.valueOf(indexedValue2.LIZ));
                            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                        }
                        C823170WQx<String> c823170WQx4 = LIZLLL;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str3 : c823170WQx4) {
                            if (linkedHashMap2.containsKey(str3)) {
                                arrayList2.add(str3);
                            }
                        }
                        strLJJLIIIJ2 = C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS505S0100000_6(linkedHashMap2, 3), arrayList2), ",", null, null, 0, null, null, 62);
                    } else {
                        strLJJLIIIJ2 = C13LP.LJJLIIIJ(c823170WQx3, ",", null, null, 0, null, null, 62);
                    }
                    c830490Whz.put("int_sticker_id_list", strLJJLIIIJ2);
                }
                if (C2534709wX.LIZ()) {
                    c830490Whz.put("personalized_typing_reco", "1");
                }
                interfaceC1493105sv.sendEvent("auto_emoji_show", c830490Whz);
            }
            LIZJ.clear();
            LIZLLL.clear();
        }
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if ((i & 1) != 0) {
            str = "chat";
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("sticker_id", str2);
        c830490Whz.put("sticker_type", str3);
        c830490Whz.put("action", str4);
        c830490Whz.put("chat_type", str5);
        if (map != null) {
            c830490Whz.putAll(map);
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_sticker_popup", c830490Whz);
    }

    public static void LJFF(String str, String str2, String str3, String str4, String str5, Map map, int i) {
        if ((i & 1) != 0) {
            str = "chat";
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("sticker_id", str3);
        c830490Whz.put("sticker_type", str4);
        c830490Whz.put("chat_type", str5);
        if (map != null) {
            c830490Whz.putAll(map);
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("open_sticker_popup", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics
    public final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, int i, List<String> list, List<String> list2, String str12, InterfaceC1493105sv interfaceC1493105sv) {
        BigInteger bigIntegerLIZ;
        String str13;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        if (str3.length() > 0) {
            C13KL.LIZ.getClass();
            bigIntegerLIZ = C13KL.LIZ(str3);
        } else {
            bigIntegerLIZ = null;
        }
        C830490Whz c830490Whz = new C830490Whz();
        if (str5 != null) {
            LIZJ.add(str5);
            c830490Whz.put("sticker_id", str5);
        }
        if (str6 != null) {
            c830490Whz.put("message_type", str6);
        }
        c830490Whz.put("to_user_id", str2);
        c830490Whz.put("from_user_id", str3);
        c830490Whz.put("chat_type", str4);
        c830490Whz.put("conversation_id", str);
        if (str7 != null) {
            c830490Whz.put("panel_type", str7);
        }
        C823170WQx<String> c823170WQx = LIZJ;
        int i2 = 16;
        if (!c823170WQx.isEmpty()) {
            if (list != null) {
                C717620SCy c717620SCyLLIIL = C13LP.LLIIL(list);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                Iterator it2 = c717620SCyLLIIL.iterator();
                while (true) {
                    C717610SCx c717610SCx = (C717610SCx) it2;
                    if (!c717610SCx.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                    Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C823170WQx<String> c823170WQx2 = LIZJ;
                ArrayList arrayList = new ArrayList();
                for (String str14 : c823170WQx2) {
                    if (linkedHashMap.containsKey(str14)) {
                        arrayList.add(str14);
                    }
                }
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS505S0100000_6(linkedHashMap, 0), arrayList), ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(c823170WQx, ",", null, null, 0, null, null, 62);
            }
            c830490Whz.put("sticker_id_list", strLJJLIIIJ2);
        }
        if (str8 != null) {
            c830490Whz.put("query_session_id", str8);
        }
        if (str9 != null) {
            c830490Whz.put("hashed_keyword", str9);
        }
        if (str10 != null) {
            c830490Whz.put("hashed_keyword_v2", str10);
        }
        c830490Whz.put("click_index", String.valueOf(i));
        if (z) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("has_ai_sticker", str13);
        if (bigIntegerLIZ != null) {
            c830490Whz.put("hash_uid", bigIntegerLIZ.toString());
        }
        if (str11 != null) {
            LIZLLL.add(str11);
            c830490Whz.put("int_sticker_id", str11);
        }
        C823170WQx<String> c823170WQx3 = LIZLLL;
        if (!c823170WQx3.isEmpty()) {
            if (list2 != null) {
                C717620SCy c717620SCyLLIIL2 = C13LP.LLIIL(list2);
                int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL2, 10));
                if (iLIZIZ2 >= 16) {
                    i2 = iLIZIZ2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                Iterator it3 = c717620SCyLLIIL2.iterator();
                while (true) {
                    C717610SCx c717610SCx2 = (C717610SCx) it3;
                    if (!c717610SCx2.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue2 = (IndexedValue) c717610SCx2.next();
                    Pair pair2 = new Pair(indexedValue2.LIZIZ, Integer.valueOf(indexedValue2.LIZ));
                    linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
                }
                C823170WQx<String> c823170WQx4 = LIZLLL;
                ArrayList arrayList2 = new ArrayList();
                for (String str15 : c823170WQx4) {
                    if (linkedHashMap2.containsKey(str15)) {
                        arrayList2.add(str15);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJLLLL(new AComparatorS505S0100000_6(linkedHashMap2, 1), arrayList2), ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(c823170WQx3, ",", null, null, 0, null, null, 62);
            }
            c830490Whz.put("int_sticker_id_list", strLJJLIIIJ);
        }
        if (C2534709wX.LIZ()) {
            c830490Whz.put("personalized_typing_reco", "1");
        }
        if (str12 != null) {
            c830490Whz.put("input_language", str12);
        }
        interfaceC1493105sv.sendEvent("auto_emoji_click", c830490Whz);
    }
}
