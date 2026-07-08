package com.ss.android.ugc.aweme.agent.tools.business;

import X.C09CT;
import X.C13LP;
import X.C1697810uHb;
import X.C2188811AlT;
import X.InterfaceC596930Nb9;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ConfigCommandPayload implements InterfaceC596930Nb9 {

    @C09CT("auto_scroll")
    public ActionCommandPayload autoScroll;

    @C09CT("clear_display")
    public ActionCommandPayload clearDisplay;

    @C09CT("pip")
    public ActionCommandPayload pip;

    @C09CT("show_captions")
    public ActionCommandPayload showCaptions;

    @C09CT("speed")
    public ActionCommandPayload speed;

    @C09CT("translate_posts")
    public ActionCommandPayload translatePosts;

    @C09CT("volume")
    public ActionCommandPayload volume;

    public ConfigCommandPayload() {
        this(null, null, null, null, null, null, null);
    }

    @Override // X.InterfaceC596930Nb9
    public final String LIZ() {
        Iterator it2 = C13LP.LJJJJLI(C1697810uHb.LJIIJJI(this.speed, this.clearDisplay, this.autoScroll, this.volume, this.pip, this.showCaptions, this.translatePosts)).iterator();
        while (it2.hasNext()) {
            String str = ((ActionCommandPayload) it2.next()).message;
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    @Override // X.InterfaceC596930Nb9
    public final boolean LIZIZ() {
        List<ActionCommandPayload> listLJIIJJI = C1697810uHb.LJIIJJI(this.speed, this.clearDisplay, this.autoScroll, this.volume, this.pip, this.showCaptions, this.translatePosts);
        if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
            for (ActionCommandPayload actionCommandPayload : listLJIIJJI) {
                if (actionCommandPayload != null && actionCommandPayload.success) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigCommandPayload)) {
            return false;
        }
        ConfigCommandPayload configCommandPayload = (ConfigCommandPayload) obj;
        return Intrinsics.LJFF(this.speed, configCommandPayload.speed) && Intrinsics.LJFF(this.clearDisplay, configCommandPayload.clearDisplay) && Intrinsics.LJFF(this.autoScroll, configCommandPayload.autoScroll) && Intrinsics.LJFF(this.volume, configCommandPayload.volume) && Intrinsics.LJFF(this.pip, configCommandPayload.pip) && Intrinsics.LJFF(this.showCaptions, configCommandPayload.showCaptions) && Intrinsics.LJFF(this.translatePosts, configCommandPayload.translatePosts);
    }

    public final int hashCode() {
        ActionCommandPayload actionCommandPayload = this.speed;
        int iHashCode = (actionCommandPayload == null ? 0 : actionCommandPayload.hashCode()) * 31;
        ActionCommandPayload actionCommandPayload2 = this.clearDisplay;
        int iHashCode2 = (iHashCode + (actionCommandPayload2 == null ? 0 : actionCommandPayload2.hashCode())) * 31;
        ActionCommandPayload actionCommandPayload3 = this.autoScroll;
        int iHashCode3 = (iHashCode2 + (actionCommandPayload3 == null ? 0 : actionCommandPayload3.hashCode())) * 31;
        ActionCommandPayload actionCommandPayload4 = this.volume;
        int iHashCode4 = (iHashCode3 + (actionCommandPayload4 == null ? 0 : actionCommandPayload4.hashCode())) * 31;
        ActionCommandPayload actionCommandPayload5 = this.pip;
        int iHashCode5 = (iHashCode4 + (actionCommandPayload5 == null ? 0 : actionCommandPayload5.hashCode())) * 31;
        ActionCommandPayload actionCommandPayload6 = this.showCaptions;
        int iHashCode6 = (iHashCode5 + (actionCommandPayload6 == null ? 0 : actionCommandPayload6.hashCode())) * 31;
        ActionCommandPayload actionCommandPayload7 = this.translatePosts;
        return iHashCode6 + (actionCommandPayload7 != null ? actionCommandPayload7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfigCommandPayload(speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", clearDisplay=");
        sbLIZ.append(this.clearDisplay);
        sbLIZ.append(", autoScroll=");
        sbLIZ.append(this.autoScroll);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.volume);
        sbLIZ.append(", pip=");
        sbLIZ.append(this.pip);
        sbLIZ.append(", showCaptions=");
        sbLIZ.append(this.showCaptions);
        sbLIZ.append(", translatePosts=");
        sbLIZ.append(this.translatePosts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ConfigCommandPayload(ActionCommandPayload actionCommandPayload, ActionCommandPayload actionCommandPayload2, ActionCommandPayload actionCommandPayload3, ActionCommandPayload actionCommandPayload4, ActionCommandPayload actionCommandPayload5, ActionCommandPayload actionCommandPayload6, ActionCommandPayload actionCommandPayload7) {
        this.speed = actionCommandPayload;
        this.clearDisplay = actionCommandPayload2;
        this.autoScroll = actionCommandPayload3;
        this.volume = actionCommandPayload4;
        this.pip = actionCommandPayload5;
        this.showCaptions = actionCommandPayload6;
        this.translatePosts = actionCommandPayload7;
    }
}
