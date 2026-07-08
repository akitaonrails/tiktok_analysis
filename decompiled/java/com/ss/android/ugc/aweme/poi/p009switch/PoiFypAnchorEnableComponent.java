package com.ss.android.ugc.aweme.poi.p009switch;

import X.AbstractC848400XPy;
import X.C0C64;
import X.C0XQ7;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C2188811AlT;
import X.C607490NsB;
import X.C607500NsC;
import X.C724240Sb0;
import X.InterfaceC427710Gpt;
import X.InterfaceC606850Nr9;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.p009switch.PoiFypAnchorEnableComponent;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiFypAnchorEnableComponent extends BasePanelComponent {
    public InterfaceC606850Nr9 LL;
    public C607490NsB LLILLJJLI;

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        Fragment fragmentLJI;
        DataLayerAbility dataLayerAbility;
        super.onDestroy();
        if (C607500NsC.LIZ()) {
            InterfaceC606850Nr9 interfaceC606850Nr9 = this.LL;
            if (interfaceC606850Nr9 != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (dataLayerAbility = (DataLayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), DataLayerAbility.class, null)) != null) {
                dataLayerAbility.oQ1(interfaceC606850Nr9);
            }
            this.LL = null;
        }
        if (C607500NsC.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_enable_using_anchor", false) == 2) {
            C607490NsB c607490NsB = this.LLILLJJLI;
            if (c607490NsB != null) {
                ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(c607490NsB);
            }
            this.LLILLJJLI = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Gpt, X.0NsB] */
    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        if (C607500NsC.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_enable_using_anchor", false) == 2) {
            ?? r1 = new InterfaceC427710Gpt() { // from class: X.0NsB
                @Override // X.InterfaceC427710Gpt
                public final void LLLLLLZZ(int i, User user, User user2) {
                    String uid;
                    String uid2;
                    String uid3;
                    String uid4;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUserChanged, oldUser.uid = ");
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    sbLIZ.append(uid);
                    sbLIZ.append(", newUser.uid = ");
                    if (user2 != null) {
                        uid2 = user2.getUid();
                    } else {
                        uid2 = null;
                    }
                    sbLIZ.append(uid2);
                    sbLIZ.append(", type = ");
                    sbLIZ.append(i);
                    sbLIZ.append(", extra = ");
                    sbLIZ.append((Object) null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (user != null) {
                        uid3 = user.getUid();
                    } else {
                        uid3 = null;
                    }
                    if (user2 != null) {
                        uid4 = user2.getUid();
                    } else {
                        uid4 = null;
                    }
                    if (!Intrinsics.LJFF(uid3, uid4) && i != 13 && i != 14) {
                        if ((user == null || user.getUid() == null) && i == 5) {
                            return;
                        }
                        PoiEnableExperiment.LIZ = null;
                    }
                }
            };
            this.LLILLJJLI = r1;
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(r1);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                final DataLayerAbility dataLayerAbility = (DataLayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), DataLayerAbility.class, null);
                if (dataLayerAbility != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getItems count = ");
                    List<Aweme> items = dataLayerAbility.getItems();
                    sbLIZ.append(items != null ? Integer.valueOf(items.size()) : null);
                    C2188811AlT.LIZIZ(sbLIZ);
                    bo(dataLayerAbility.getItems());
                    if (C607500NsC.LIZ()) {
                        InterfaceC606850Nr9 interfaceC606850Nr9 = this.LL;
                        if (interfaceC606850Nr9 == null) {
                            interfaceC606850Nr9 = new InterfaceC606850Nr9() { // from class: X.0NsA
                                @Override // X.InterfaceC606850Nr9
                                public final void LIZLLL(int i, Aweme aweme, String str) {
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LJFF() {
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LJII(Map map) {
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LJIIJJI(int i, int i2, String str, List list, List list2) {
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LIZ(List<? extends Aweme> list) {
                                    Integer numValueOf;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("newItems count = ");
                                    List<Aweme> items2 = dataLayerAbility.getItems();
                                    if (items2 != null) {
                                        numValueOf = Integer.valueOf(items2.size());
                                    } else {
                                        numValueOf = null;
                                    }
                                    sbLIZ2.append(numValueOf);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    this.getClass();
                                    PoiFypAnchorEnableComponent.bo(list);
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LJIIJ(List<? extends Aweme> list) {
                                    Integer numValueOf;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("onLoadMore newItems count = ");
                                    List<Aweme> items2 = dataLayerAbility.getItems();
                                    if (items2 != null) {
                                        numValueOf = Integer.valueOf(items2.size());
                                    } else {
                                        numValueOf = null;
                                    }
                                    sbLIZ2.append(numValueOf);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    this.getClass();
                                    PoiFypAnchorEnableComponent.bo(list);
                                }

                                @Override // X.InterfaceC606850Nr9
                                public final void LIZIZ(int i, String str, List list) {
                                    Integer numValueOf;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("insertedItems count = ");
                                    List<Aweme> items2 = dataLayerAbility.getItems();
                                    if (items2 != null) {
                                        numValueOf = Integer.valueOf(items2.size());
                                    } else {
                                        numValueOf = null;
                                    }
                                    sbLIZ2.append(numValueOf);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    this.getClass();
                                    PoiFypAnchorEnableComponent.bo(list);
                                }
                            };
                        }
                        this.LL = interfaceC606850Nr9;
                        dataLayerAbility.oQ1(interfaceC606850Nr9);
                        dataLayerAbility.pV(interfaceC606850Nr9);
                    }
                }
            }
        }
    }

    public static void bo(List list) {
        String str;
        boolean z;
        if (list == null || list.isEmpty() || Intrinsics.LJFF(PoiEnableExperiment.LIZ, Boolean.TRUE)) {
            return;
        }
        for (Aweme aweme : (ArrayList) C13LP.LJJJJLI(list)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FypComponent poiDataStruct.poiName = ");
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct != null) {
                str = poiDataStruct.poiName;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", is Null: ");
            if (aweme.getPoiDataStruct() == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            if (aweme.getPoiDataStruct() != null) {
                PoiEnableExperiment.LIZ = Boolean.TRUE;
                return;
            }
        }
    }
}
