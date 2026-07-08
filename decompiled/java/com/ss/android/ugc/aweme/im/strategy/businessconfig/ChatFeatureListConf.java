package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C1660006ek;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatFeatureListConf extends IBusinessConfig {
    public static final C1660006ek Companion = new Object() { // from class: X.06ek
    };

    @C09CT("chat_type")
    public final int chatType;

    @C09CT("components")
    public List<ChatComponentConfig> components;

    public ChatFeatureListConf() {
        this(-1, null);
    }

    public final ChatFeatureListConf copy(int i, List<ChatComponentConfig> list) {
        return new ChatFeatureListConf(i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatFeatureListConf)) {
            return false;
        }
        ChatFeatureListConf chatFeatureListConf = (ChatFeatureListConf) obj;
        return this.chatType == chatFeatureListConf.chatType && Intrinsics.LJFF(this.components, chatFeatureListConf.components);
    }

    public int hashCode() {
        int i = this.chatType * 31;
        List<ChatComponentConfig> list = this.components;
        return i + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatFeatureListConf(chatType=");
        sbLIZ.append(this.chatType);
        sbLIZ.append(", components=");
        sbLIZ.append(this.components);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isB2CChat() {
        return this.chatType == 11;
    }

    public final boolean isBotChat() {
        return this.chatType == 13;
    }

    public final boolean isBusinessFanGroup() {
        return this.chatType == 12;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final List<ChatComponentConfig> getComponents() {
        return this.components;
    }

    public final boolean componentEnable(String str) {
        ChatComponentConfig next;
        List<ChatComponentConfig> list = this.components;
        if (list != null) {
            Iterator<ChatComponentConfig> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.componentId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ChatComponentConfig chatComponentConfig = next;
            if (chatComponentConfig != null) {
                return chatComponentConfig.enable;
            }
            return true;
        }
        return true;
    }

    public final ChatComponentConfig getComponent(String str) {
        List<ChatComponentConfig> list = this.components;
        ChatComponentConfig chatComponentConfig = null;
        if (list == null) {
            return null;
        }
        Iterator<ChatComponentConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ChatComponentConfig next = it2.next();
            if (Intrinsics.LJFF(next.componentId, str)) {
                chatComponentConfig = next;
                break;
            }
        }
        return chatComponentConfig;
    }

    public final void setComponents(List<ChatComponentConfig> list) {
        this.components = list;
    }

    public ChatFeatureListConf(int i, List<ChatComponentConfig> list) {
        this.chatType = i;
        this.components = list;
    }

    public final boolean specificSubComponentEnable(String str, String str2) {
        ChatComponentConfig next;
        List<ChatComponentConfig> list = this.components;
        if (list != null) {
            Iterator<ChatComponentConfig> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.componentId, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ChatComponentConfig chatComponentConfig = next;
            if (chatComponentConfig != null) {
                if (chatComponentConfig.enable) {
                    String str3 = chatComponentConfig.bizData;
                    if (str3 != null && str3.length() != 0 && new JSONObject(chatComponentConfig.bizData).optInt(str2, 1) != 1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
