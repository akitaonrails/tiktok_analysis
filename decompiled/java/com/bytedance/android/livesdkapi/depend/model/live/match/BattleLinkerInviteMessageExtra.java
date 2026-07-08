package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleLinkerInviteMessageExtra {

    @C09CT("duration")
    public Long duration;

    @C09CT("extra")
    public InviterRivalExtra extra;

    @C09CT("invite_type")
    public Long inviteType;

    @C09CT("match_type")
    public Long matchType;

    @C09CT(Scene.SCENE_SERVICE)
    public Long scene;

    @C09CT("sub_type")
    public Long subType;

    @C09CT("tags")
    public List<BattleRivalTag> tags;

    @C09CT("theme")
    public String theme;

    @C09CT("tips")
    public String tips;

    public static final class InviterRivalExtra {

        @C09CT("Label")
        public String label;

        @C09CT("TextType")
        public Long texttype;

        @C09CT("Text")
        public String webcastDataText;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.texttype != null) {
                sb.append(", TextType=");
                sb.append(this.texttype);
            }
            if (this.webcastDataText != null) {
                sb.append(", Text=");
                sb.append(this.webcastDataText);
            }
            if (this.label != null) {
                sb.append(", Label=");
                sb.append(this.label);
            }
            sb.replace(0, 2, "InviterRivalExtra{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.matchType != null) {
            sb.append(", match_type=");
            sb.append(this.matchType);
        }
        if (this.tips != null) {
            sb.append(", tips=");
            sb.append(this.tips);
        }
        if (this.inviteType != null) {
            sb.append(", invite_type=");
            sb.append(this.inviteType);
        }
        if (this.subType != null) {
            sb.append(", sub_type=");
            sb.append(this.subType);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.theme != null) {
            sb.append(", theme=");
            sb.append(this.theme);
        }
        if (this.duration != null) {
            sb.append(", duration=");
            sb.append(this.duration);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        List<BattleRivalTag> list = this.tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.replace(0, 2, "BattleLinkerInviteMessageExtra{");
        sb.append('}');
        return sb.toString();
    }
}
