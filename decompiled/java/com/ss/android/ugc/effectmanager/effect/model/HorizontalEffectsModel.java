package com.ss.android.ugc.effectmanager.effect.model;

import X.C01GW;
import X.C13BV;
import X.C13GX;
import X.C13HG;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC452301pR;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class HorizontalEffectsModel implements Serializable {
    public static final C01GW<C13HG<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public List<? extends Effect> favorite_effects;
    public final boolean from_cache;
    public List<? extends Effect> insert_effects;
    public List<? extends Effect> left_trending_effects;
    public final String logId;
    public List<? extends Effect> recent_effects;
    public List<? extends Effect> trending_effects;
    public final List<String> url_prefix;

    public HorizontalEffectsModel() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, (List) null, false, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public final HorizontalEffectsModel copy(List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<? extends Effect> list5, List<String> list6, boolean z, String str) {
        return new HorizontalEffectsModel(list, list2, list3, list4, list5, list6, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalEffectsModel)) {
            return false;
        }
        HorizontalEffectsModel horizontalEffectsModel = (HorizontalEffectsModel) obj;
        return Intrinsics.LJFF(this.trending_effects, horizontalEffectsModel.trending_effects) && Intrinsics.LJFF(this.favorite_effects, horizontalEffectsModel.favorite_effects) && Intrinsics.LJFF(this.recent_effects, horizontalEffectsModel.recent_effects) && Intrinsics.LJFF(this.insert_effects, horizontalEffectsModel.insert_effects) && Intrinsics.LJFF(this.left_trending_effects, horizontalEffectsModel.left_trending_effects) && Intrinsics.LJFF(this.url_prefix, horizontalEffectsModel.url_prefix) && this.from_cache == horizontalEffectsModel.from_cache && Intrinsics.LJFF(this.logId, horizontalEffectsModel.logId);
    }

    public int hashCode() {
        int iHashCode = this.trending_effects.hashCode() * 31;
        List<? extends Effect> list = this.favorite_effects;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<? extends Effect> list2 = this.recent_effects;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<? extends Effect> list3 = this.insert_effects;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<? extends Effect> list4 = this.left_trending_effects;
        int iHashCode5 = (((((iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31) + this.url_prefix.hashCode()) * 31) + C786410Ut5.Z2(this.from_cache)) * 31;
        String str = this.logId;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        $childSerializers = new C01GW[]{C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(188)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(189)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(190)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(191)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(192)), C452501pT.LIZ(enumC452301pR, AFwS219S0000000_30.get$arr$(193)), null, null};
    }

    public String toString() {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(hashCode());
            sbLIZ.append("[fromCache: ");
            sbLIZ.append(this.from_cache);
            sbLIZ.append(", size: trending-");
            sbLIZ.append(this.trending_effects.size());
            sbLIZ.append(", fav-");
            List<? extends Effect> list = this.favorite_effects;
            sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
            sbLIZ.append(", recent-");
            List<? extends Effect> list2 = this.recent_effects;
            sbLIZ.append(list2 != null ? Integer.valueOf(list2.size()) : null);
            sbLIZ.append(", insert-");
            List<? extends Effect> list3 = this.insert_effects;
            sbLIZ.append(list3 != null ? Integer.valueOf(list3.size()) : null);
            sbLIZ.append(", leftTrending-");
            List<? extends Effect> list4 = this.left_trending_effects;
            sbLIZ.append(list4 != null ? Integer.valueOf(list4.size()) : null);
            sbLIZ.append(']');
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "HorizontalEffectsModel";
        }
    }

    public static final class Companion {
        public final C13HG<HorizontalEffectsModel> serializer() {
            return HorizontalEffectsModel$$serializer.INSTANCE;
        }
    }

    public final void setFavorite_effects(List<? extends Effect> list) {
        this.favorite_effects = list;
    }

    public final void setInsert_effects(List<? extends Effect> list) {
        this.insert_effects = list;
    }

    public final void setLeft_trending_effects(List<? extends Effect> list) {
        this.left_trending_effects = list;
    }

    public final void setRecent_effects(List<? extends Effect> list) {
        this.recent_effects = list;
    }

    public final void setTrending_effects(List<? extends Effect> list) {
        this.trending_effects = list;
    }

    public static final void write$Self$ckresource_model_release(HorizontalEffectsModel horizontalEffectsModel, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        C01GW<C13HG<Object>>[] c01gwArr = $childSerializers;
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(horizontalEffectsModel.trending_effects, C13BV.INSTANCE)) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 0, c01gwArr[0].getValue(), horizontalEffectsModel.trending_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.favorite_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 1, c01gwArr[1].getValue(), horizontalEffectsModel.favorite_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.recent_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, c01gwArr[2].getValue(), horizontalEffectsModel.recent_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.insert_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, c01gwArr[3].getValue(), horizontalEffectsModel.insert_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.left_trending_effects != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, c01gwArr[4].getValue(), horizontalEffectsModel.left_trending_effects);
        }
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(horizontalEffectsModel.url_prefix, C13BV.INSTANCE)) {
            interfaceC19986513Hz.LJJIIJ(interfaceC19983313Gt, 5, c01gwArr[5].getValue(), horizontalEffectsModel.url_prefix);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.from_cache) {
            interfaceC19986513Hz.LJIIJ(interfaceC19983313Gt, 6, horizontalEffectsModel.from_cache);
        }
        if (interfaceC19986513Hz.LJIJJ() || horizontalEffectsModel.logId != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 7, C13GX.LIZ, horizontalEffectsModel.logId);
        }
    }

    public HorizontalEffectsModel(List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<? extends Effect> list5, List<String> list6, boolean z, String str) {
        this.trending_effects = list;
        this.favorite_effects = list2;
        this.recent_effects = list3;
        this.insert_effects = list4;
        this.left_trending_effects = list5;
        this.url_prefix = list6;
        this.from_cache = z;
        this.logId = str;
    }

    public HorizontalEffectsModel(int i, List list, List list2, List list3, List list4, List list5, List list6, boolean z, String str, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            this.trending_effects = (i & 1) == 0 ? C13BV.INSTANCE : list;
            if ((i & 2) == 0) {
                this.favorite_effects = null;
            } else {
                this.favorite_effects = list2;
            }
            if ((i & 4) == 0) {
                this.recent_effects = null;
            } else {
                this.recent_effects = list3;
            }
            if ((i & 8) == 0) {
                this.insert_effects = null;
            } else {
                this.insert_effects = list4;
            }
            if ((i & 16) == 0) {
                this.left_trending_effects = null;
            } else {
                this.left_trending_effects = list5;
            }
            if ((i & 32) == 0) {
                this.url_prefix = C13BV.INSTANCE;
            } else {
                this.url_prefix = list6;
            }
            if ((i & 64) == 0) {
                this.from_cache = false;
            } else {
                this.from_cache = z;
            }
            if ((i & 128) == 0) {
                this.logId = null;
                return;
            } else {
                this.logId = str;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, HorizontalEffectsModel$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public HorizontalEffectsModel(List list, List list2, List list3, List list4, List list5, List list6, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? C13BV.INSTANCE : list6, (i & 64) != 0 ? false : z, (i & 128) == 0 ? str : null);
    }
}
