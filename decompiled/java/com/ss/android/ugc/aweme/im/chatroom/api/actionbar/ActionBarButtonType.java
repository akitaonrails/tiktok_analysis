package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C08FF;
import X.C2097908Jt;
import X.C2254308sP;
import X.C908740Zku;
import X.InterfaceC1294060jmO;
import X.InterfaceC2044707zh;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarButtonType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ActionBarButtonType[] $VALUES;
    public static final C908740Zku Companion;
    public static final Map<Integer, ActionBarButtonType> map;
    public final int value;
    public static final ActionBarButtonType UNKNOWN = new ActionBarButtonType("UNKNOWN", 0, 0);
    public static final ActionBarButtonType NORMAL_EMOJI = new ActionBarButtonType("NORMAL_EMOJI", 1, 1);

    @InterfaceC1294060jmO
    public static final ActionBarButtonType STICKER = new ActionBarButtonType("STICKER", 2, 2);
    public static final ActionBarButtonType ANIMATED_EMOJI = new ActionBarButtonType("ANIMATED_EMOJI", 3, 3);
    public static final ActionBarButtonType VIDEO_SHARE = new ActionBarButtonType("VIDEO_SHARE", 4, 4);
    public static final ActionBarButtonType NUDGE = new ActionBarButtonType("NUDGE", 5, 5);
    public static final ActionBarButtonType NUDGE_BACK = new ActionBarButtonType("NUDGE_BACK", 6, 6);
    public static final ActionBarButtonType STICKER_STORE = new ActionBarButtonType("STICKER_STORE", 7, 7);
    public static final ActionBarButtonType SUGGESTED_QUERY = new ActionBarButtonType("SUGGESTED_QUERY", 8, 8);
    public static final ActionBarButtonType SET_STICKER = new ActionBarButtonType("SET_STICKER", 9, 10);
    public static final ActionBarButtonType GO_LIVE = new ActionBarButtonType("GO_LIVE", 10, 11);
    public static final ActionBarButtonType WATCH_LIVE = new ActionBarButtonType("WATCH_LIVE", 11, 12);
    public static final ActionBarButtonType STREAK = new ActionBarButtonType("STREAK", 12, 13);
    public static final ActionBarButtonType STREAK_BACK = new ActionBarButtonType("STREAK_BACK", 13, 14);
    public static final ActionBarButtonType FORM_CARD_ENTRANCE = new ActionBarButtonType("FORM_CARD_ENTRANCE", 14, 15);
    public static final ActionBarButtonType LIGHT_INTERACTION = new ActionBarButtonType("LIGHT_INTERACTION", 15, 16);
    public static final ActionBarButtonType EFFECTS = new ActionBarButtonType("EFFECTS", 16, 17);
    public static final ActionBarButtonType PHOTO_SWAP = new ActionBarButtonType("PHOTO_SWAP", 17, 18);
    public static final ActionBarButtonType AI_GROUP_SHOT = new ActionBarButtonType("AI_GROUP_SHOT", 18, 19);
    public static final ActionBarButtonType STREAK_PET = new ActionBarButtonType("STREAK_PET", 19, 20);
    public static final ActionBarButtonType FORTUNE_COOKIE = new ActionBarButtonType("FORTUNE_COOKIE", 20, 21);
    public static final ActionBarButtonType SOCIAL_AVATAR = new ActionBarButtonType("SOCIAL_AVATAR", 21, 22);
    public static final ActionBarButtonType UNIVERSAL_BUTTON = new ActionBarButtonType("UNIVERSAL_BUTTON", 22, 23);
    public static final ActionBarButtonType PLAYOFF = new ActionBarButtonType("PLAYOFF", 23, 24);
    public static final ActionBarButtonType SHARED_FEED = new ActionBarButtonType("SHARED_FEED", 24, 25);
    public static final ActionBarButtonType AVATAR_DUO_INVITATION = new ActionBarButtonType("AVATAR_DUO_INVITATION", 25, 26);
    public static final ActionBarButtonType GROUP_LIVE_EVENT = new ActionBarButtonType("GROUP_LIVE_EVENT", 26, 27);
    public static final ActionBarButtonType GREETING_CARD = new ActionBarButtonType("GREETING_CARD", 27, 28);
    public static final ActionBarButtonType MIX_STUDIO = new ActionBarButtonType("MIX_STUDIO", 28, 29);
    public static final ActionBarButtonType AI_THEATER = new ActionBarButtonType("AI_THEATER", 29, 30);

    public static final /* synthetic */ ActionBarButtonType[] $values() {
        return new ActionBarButtonType[]{UNKNOWN, NORMAL_EMOJI, STICKER, ANIMATED_EMOJI, VIDEO_SHARE, NUDGE, NUDGE_BACK, STICKER_STORE, SUGGESTED_QUERY, SET_STICKER, GO_LIVE, WATCH_LIVE, STREAK, STREAK_BACK, FORM_CARD_ENTRANCE, LIGHT_INTERACTION, EFFECTS, PHOTO_SWAP, AI_GROUP_SHOT, STREAK_PET, FORTUNE_COOKIE, SOCIAL_AVATAR, UNIVERSAL_BUTTON, PLAYOFF, SHARED_FEED, AVATAR_DUO_INVITATION, GROUP_LIVE_EVENT, GREETING_CARD, MIX_STUDIO, AI_THEATER};
    }

    public static InterfaceC2044707zh<ActionBarButtonType> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0Zku] */
    static {
        ActionBarButtonType[] actionBarButtonTypeArr$values = $values();
        $VALUES = actionBarButtonTypeArr$values;
        $ENTRIES = new C2254308sP(actionBarButtonTypeArr$values);
        Companion = new Object() { // from class: X.0Zku
        };
        ActionBarButtonType[] actionBarButtonTypeArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(actionBarButtonTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ >= 16 ? iLIZIZ : 16);
        for (ActionBarButtonType actionBarButtonType : actionBarButtonTypeArrValues) {
            linkedHashMap.put(Integer.valueOf(actionBarButtonType.value), actionBarButtonType);
        }
        map = linkedHashMap;
    }

    public static ActionBarButtonType[] values() {
        return (ActionBarButtonType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static ActionBarButtonType valueOf(String str) {
        return (ActionBarButtonType) C08FF.LIZ(ActionBarButtonType.class, str);
    }

    public ActionBarButtonType(String str, int i, int i2) {
        this.value = i2;
    }
}
