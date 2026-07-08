package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class LinkUserState {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LinkUserState[] $VALUES;
    public static final LinkUserState LINKED = new LinkUserState("LINKED", 0);
    public static final LinkUserState INVITEE = new LinkUserState("INVITEE", 1);
    public static final LinkUserState APPLICANT = new LinkUserState("APPLICANT", 2);

    public static final /* synthetic */ LinkUserState[] $values() {
        return new LinkUserState[]{LINKED, INVITEE, APPLICANT};
    }

    public static InterfaceC2044707zh<LinkUserState> getEntries() {
        return $ENTRIES;
    }

    static {
        LinkUserState[] linkUserStateArr$values = $values();
        $VALUES = linkUserStateArr$values;
        $ENTRIES = new C2254308sP(linkUserStateArr$values);
    }

    public static LinkUserState[] values() {
        return (LinkUserState[]) $VALUES.clone();
    }

    public static LinkUserState valueOf(String str) {
        return (LinkUserState) C08FF.LIZ(LinkUserState.class, str);
    }

    public LinkUserState(String str, int i) {
    }
}
