package com.ss.android.ugc.aweme.favorites.business.aweme;

import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeFavoriteCache implements StateAgentCache<Boolean> {
    public static final int $stable = 0;
    public final String id;
    public final boolean state;

    public final boolean component2() {
        return this.state;
    }

    public final AwemeFavoriteCache copy(String str, boolean z) {
        return new AwemeFavoriteCache(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeFavoriteCache)) {
            return false;
        }
        AwemeFavoriteCache awemeFavoriteCache = (AwemeFavoriteCache) obj;
        return Intrinsics.LJFF(this.id, awemeFavoriteCache.id) && this.state == awemeFavoriteCache.state;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + C786410Ut5.Z2(this.state);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeFavoriteCache(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public Boolean getState() {
        return Boolean.valueOf(this.state);
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache, com.bytedance.mota.storage.motacache.IMotaCache
    public String getMotaCacheID() {
        return getId();
    }

    @Override // com.ss.android.ugc.aweme.state.base.StateAgentCache
    public String getId() {
        return this.id;
    }

    public AwemeFavoriteCache(String str, boolean z) {
        this.id = str;
        this.state = z;
    }
}
