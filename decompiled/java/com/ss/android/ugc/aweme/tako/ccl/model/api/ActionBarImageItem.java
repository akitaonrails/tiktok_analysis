package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ActionBarImageItem {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("convert_style")
    public final ConvertStyle convertStyle;

    @C09CT("dark_mode_icon")
    public final String darkIcon;

    @C09CT("place_holder")
    public final String inputHint;

    @C09CT("light_mode_icon")
    public final String lightIcon;

    @C09CT("name_text")
    public final String name;

    @C09CT("sug")
    public final TakoSug sug;

    @C09CT("unique_key")
    public final String uniqueKey;

    public ActionBarImageItem() {
        this(-1, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarImageItem)) {
            return false;
        }
        ActionBarImageItem actionBarImageItem = (ActionBarImageItem) obj;
        return this.actionType == actionBarImageItem.actionType && Intrinsics.LJFF(this.uniqueKey, actionBarImageItem.uniqueKey) && Intrinsics.LJFF(this.lightIcon, actionBarImageItem.lightIcon) && Intrinsics.LJFF(this.darkIcon, actionBarImageItem.darkIcon) && Intrinsics.LJFF(this.name, actionBarImageItem.name) && Intrinsics.LJFF(this.inputHint, actionBarImageItem.inputHint) && Intrinsics.LJFF(this.convertStyle, actionBarImageItem.convertStyle) && Intrinsics.LJFF(this.sug, actionBarImageItem.sug);
    }

    public final int hashCode() {
        int i = this.actionType * 31;
        String str = this.uniqueKey;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lightIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.inputHint;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ConvertStyle convertStyle = this.convertStyle;
        int iHashCode6 = (iHashCode5 + (convertStyle == null ? 0 : convertStyle.hashCode())) * 31;
        TakoSug takoSug = this.sug;
        return iHashCode6 + (takoSug != null ? takoSug.hashCode() : 0);
    }

    public ActionBarImageItem(int i, String str, String str2, String str3, String str4, String str5, ConvertStyle convertStyle, TakoSug takoSug) {
        this.actionType = i;
        this.uniqueKey = str;
        this.lightIcon = str2;
        this.darkIcon = str3;
        this.name = str4;
        this.inputHint = str5;
        this.convertStyle = convertStyle;
        this.sug = takoSug;
    }
}
