package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1843707Jz;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Top1LoadMoreStruct implements Serializable, InterfaceC1843707Jz {

    @C09CT("backtrace")
    public final String backtrace;

    @C09CT("need_load_more")
    public final boolean needLoadMore;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    public Top1LoadMoreStruct() {
        this(null, false, null);
    }

    public final boolean component2() {
        return this.needLoadMore;
    }

    public final Top1LoadMoreStruct copy(String str, boolean z, String str2) {
        return new Top1LoadMoreStruct(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Top1LoadMoreStruct)) {
            return false;
        }
        Top1LoadMoreStruct top1LoadMoreStruct = (Top1LoadMoreStruct) obj;
        return Intrinsics.LJFF(this.backtrace, top1LoadMoreStruct.backtrace) && this.needLoadMore == top1LoadMoreStruct.needLoadMore && Intrinsics.LJFF(this.scene, top1LoadMoreStruct.scene);
    }

    public int hashCode() {
        String str = this.backtrace;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.needLoadMore)) * 31;
        String str2 = this.scene;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Top1LoadMoreStruct(backtrace=");
        sbLIZ.append(this.backtrace);
        sbLIZ.append(", needLoadMore=");
        sbLIZ.append(this.needLoadMore);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1843707Jz
    public Boolean getNeedLoadMore() {
        return Boolean.valueOf(this.needLoadMore);
    }

    public final String getBacktrace() {
        return this.backtrace;
    }

    public final String getScene() {
        return this.scene;
    }

    public Top1LoadMoreStruct(String str, boolean z, String str2) {
        this.backtrace = str;
        this.needLoadMore = z;
        this.scene = str2;
    }
}
