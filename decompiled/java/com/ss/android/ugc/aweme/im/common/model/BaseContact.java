package com.ss.android.ugc.aweme.im.common.model;

import X.C098200Yq;
import X.C09CT;
import X.C123100dR;
import X.C189200o6;
import X.C7740030o;
import X.InterfaceC1294060jmO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class BaseContact implements Serializable {
    public String avatarStr;

    @C09CT("avatar_thumb")
    public UrlModel avatarThumb;
    public final UrlModel displayAvatar;
    public final String displayName;

    @C09CT("nickname")
    public String nickName;
    public int relationListItemType;

    @C09CT("sec_uid")
    public String secUid;

    @C09CT("uid")
    public String uid;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getRelationListItemType$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSecUid$annotations() {
    }

    public final UrlModel getAvatarThumb() {
        if (this.avatarThumb == null && C123100dR.LIZ(this.avatarStr)) {
            try {
                this.avatarThumb = (UrlModel) C7740030o.LIZ().getGson().LJII(this.avatarStr, UrlModel.class);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return this.avatarThumb;
    }

    public final String getAvatarStr() {
        return this.avatarStr;
    }

    public UrlModel getDisplayAvatar() {
        return this.displayAvatar;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setAvatarStr(String str) {
        this.avatarStr = str;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
        try {
            this.avatarStr = C7740030o.LIZ().getGson().LJIILL(urlModel);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
