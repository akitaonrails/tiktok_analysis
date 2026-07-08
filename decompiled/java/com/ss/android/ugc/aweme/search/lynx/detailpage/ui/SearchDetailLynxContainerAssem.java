package com.ss.android.ugc.aweme.search.lynx.detailpage.ui;

import X.C1537720q7O;
import X.C1D66;
import X.C2188811AlT;
import X.C2189821An6;
import X.C436190H8n;
import X.C680290QmJ;
import X.C725770SdT;
import X.C786410Ut5;
import X.EnumC680300QmK;
import X.EnumC680310QmL;
import X.InterfaceC725740SdQ;
import X.InterfaceC725760SdS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailLynxContainerAssem extends ReusedUIContentAssem<SearchDetailLynxContainerAssem> implements InterfaceC725740SdQ, InterfaceC725760SdS {
    public C1D66 LLJJJJ;

    @Override // X.InterfaceC725740SdQ
    public final void LJIILIIL(Aweme aweme) {
    }

    @Override // X.InterfaceC725760SdS
    public final InterfaceC725740SdQ Ug() {
        return this;
    }

    @Override // X.InterfaceC725740SdQ
    public final void al() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C1D66 c1d66 = this.LLJJJJ;
        if (c1d66 != null) {
            c1d66.LIZ();
        }
    }

    @Override // X.InterfaceC725760SdS
    public final void k5() {
        C680290QmJ.LIZ.getClass();
        ((Map) C680290QmJ.LIZIZ.getValue()).clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        super.Co();
    }

    @Override // X.InterfaceC725760SdS
    public final EnumC680310QmL getPriority() {
        return EnumC680310QmL.SEARCH_PRIORITY;
    }

    @Override // X.InterfaceC725740SdQ
    public final void A2(Aweme aweme) {
        String strLIZ;
        String str;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container onHolderResume，aweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        if (c1d66LIZIZ != null && (sparkContext = c1d66LIZIZ.LJFF) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1d66LIZIZ != null) {
            c1d66LIZIZ.LIZLLL(EnumC680300QmK.ON_HOLDER_RESUME, null);
        }
    }

    @Override // X.InterfaceC725760SdS
    public final boolean S3(C2189821An6 c2189821An6) {
        String eventType = c2189821An6.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        if (!Intrinsics.LJFF(eventType, "general_search") && !Intrinsics.LJFF(eventType, "search_result")) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC725740SdQ
    public final void Ya(Aweme aweme) {
        String strLIZ;
        String str;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container onHolderPause，aweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        if (c1d66LIZIZ != null && (sparkContext = c1d66LIZIZ.LJFF) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1d66LIZIZ != null) {
            c1d66LIZIZ.LIZLLL(EnumC680300QmK.ON_HOLDER_PAUSE, null);
        }
    }

    @Override // X.InterfaceC725740SdQ
    public final void a5(Aweme aweme) {
        String strLIZ;
        String str;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container  ");
        sbLIZ.append(LJJIJL().hashCode());
        sbLIZ.append(" unBind，aweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        if (c1d66LIZIZ != null && (sparkContext = c1d66LIZIZ.LJFF) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1d66LIZIZ != null) {
            c1d66LIZIZ.LIZLLL(EnumC680300QmK.UN_BIND, null);
        }
    }

    @Override // X.InterfaceC725740SdQ
    public final void Kc(Aweme aweme, String str) {
        Pair pair;
        String str2;
        String strLIZ;
        String strLIZ2;
        C1D66 c1d66;
        String str3;
        boolean z = true;
        if (str.length() == 0) {
            return;
        }
        C680290QmJ.LIZ.getClass();
        if (str.length() != 0) {
            z = false;
        }
        if (!z) {
            for (Map.Entry entry : ((Map) C680290QmJ.LIZIZ.getValue()).entrySet()) {
                SparkContext sparkContext = ((C1D66) entry.getValue()).LJFF;
                if (sparkContext != null) {
                    str3 = sparkContext.containerId;
                } else {
                    str3 = null;
                }
                if (Intrinsics.LJFF(str3, str)) {
                    pair = new Pair(entry.getKey(), entry.getValue());
                    str2 = (String) pair.getFirst();
                    break;
                }
            }
            pair = null;
            str2 = null;
        } else {
            pair = null;
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onJsAudioResourceLoadedEvent, containerId: ");
        sbLIZ.append(str);
        sbLIZ.append(", curAid: ");
        sbLIZ.append(str2);
        sbLIZ.append(", curAweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            strLIZ2 = C436190H8n.LIZ(aweme);
        } else {
            strLIZ2 = null;
        }
        if (Intrinsics.LJFF(str2, strLIZ2) && pair != null && (c1d66 = (C1D66) pair.getSecond()) != null) {
            c1d66.LIZLLL(EnumC680300QmK.ON_AUDIO_RESOURCE_LOADED, null);
        }
    }

    @Override // X.InterfaceC725740SdQ
    public final void ce(View view, Aweme aweme) {
        String strLIZ;
        String str;
        ViewGroup viewGroup;
        C1537720q7O c1537720q7OLJFF;
        C1537720q7O c1537720q7OLJFF2;
        ViewParent parent;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container ");
        sbLIZ.append(LJJIJL().hashCode());
        sbLIZ.append(" onViewHolderSelected，aweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        if (c1d66LIZIZ != null && (sparkContext = c1d66LIZIZ.LJFF) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = view instanceof ViewGroup;
        if (z && view != null) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup3 = (ViewGroup) viewLJJIJL) != null) {
                C786410Ut5.LJJJJI(viewGroup3);
            }
            if (c1d66LIZIZ != null && (c1537720q7OLJFF2 = c1d66LIZIZ.LJFF()) != null && (parent = c1537720q7OLJFF2.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1d66LIZIZ.LJFF(), viewGroup2);
            }
            if (z && (viewGroup = (ViewGroup) view) != null) {
                if (c1d66LIZIZ != null) {
                    c1537720q7OLJFF = c1d66LIZIZ.LJFF();
                } else {
                    c1537720q7OLJFF = null;
                }
                viewGroup.addView(c1537720q7OLJFF);
            }
        }
        if (c1d66LIZIZ != null) {
            c1d66LIZIZ.LIZLLL(EnumC680300QmK.ON_VIEWHOLDER_SELECTED, null);
        }
    }

    @Override // X.InterfaceC725740SdQ
    public final void fb(int i, Aweme aweme) {
        if (i != 1) {
            if (i == 2) {
                C680290QmJ c680290QmJ = C680290QmJ.LIZ;
                String strLIZ = C436190H8n.LIZ(aweme);
                c680290QmJ.getClass();
                C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ);
                if (c1d66LIZIZ != null) {
                    c1d66LIZIZ.LIZLLL(EnumC680300QmK.ON_SCREEN_ROTATE_LANDSCAPE, null);
                    return;
                }
                return;
            }
            return;
        }
        C680290QmJ c680290QmJ2 = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ2.getClass();
        C1D66 c1d66LIZIZ2 = C680290QmJ.LIZIZ(strLIZ2);
        if (c1d66LIZIZ2 == null) {
            return;
        }
        c1d66LIZIZ2.LIZLLL(EnumC680300QmK.ON_SCREEN_ROTATE_PORTRAIT, null);
    }

    @Override // X.InterfaceC725740SdQ
    public final void u2(View view, Aweme aweme) {
        String strLIZ;
        String str;
        ViewParent parent;
        ViewGroup viewGroup;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container ");
        sbLIZ.append(LJJIJL().hashCode());
        sbLIZ.append(" onViewHolderUnSelected，aweme: ");
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        if (c1d66LIZIZ != null && (sparkContext = c1d66LIZIZ.LJFF) != null) {
            str = sparkContext.containerId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        View viewLJJIJL = LJJIJL();
        if ((viewLJJIJL instanceof ViewGroup) && viewLJJIJL != null) {
            if (c1d66LIZIZ != null) {
                C1537720q7O c1537720q7OLJFF = c1d66LIZIZ.LJFF();
                if (c1537720q7OLJFF != null && (parent = c1537720q7OLJFF.getParent()) != null && (parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(c1d66LIZIZ.LJFF(), viewGroup);
                }
            } else {
                return;
            }
        } else if (c1d66LIZIZ == null) {
            return;
        }
        c1d66LIZIZ.LIZLLL(EnumC680300QmK.ON_VIEWHOLDER_UNSELECTED, null);
    }

    @Override // X.InterfaceC725740SdQ
    public final boolean h6(Aweme aweme, C2189821An6 c2189821An6, C725770SdT c725770SdT) {
        String strLIZ;
        SparkContext sparkContext;
        C680290QmJ c680290QmJ = C680290QmJ.LIZ;
        String strLIZ2 = C436190H8n.LIZ(aweme);
        c680290QmJ.getClass();
        C1D66 c1d66LIZIZ = C680290QmJ.LIZIZ(strLIZ2);
        if (c1d66LIZIZ != null) {
            this.LLJJJJ = c1d66LIZIZ;
            return true;
        }
        this.LLJJJJ = C680290QmJ.LIZ(aweme, LJJIJL().getContext(), c2189821An6, c725770SdT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx container  ");
        sbLIZ.append(LJJIJL().hashCode());
        sbLIZ.append(" onAssemBind，aweme: ");
        String str = null;
        if (aweme != null) {
            strLIZ = C436190H8n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append(", containerCore: ");
        C1D66 c1d66 = this.LLJJJJ;
        if (c1d66 != null && (sparkContext = c1d66.LJFF) != null) {
            str = sparkContext.containerId;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    @Override // X.InterfaceC725760SdS
    public final boolean G4(Aweme aweme, C2189821An6 c2189821An6, String str, Context context, C725770SdT c725770SdT) {
        if (!Intrinsics.LJFF(str, EnumC680310QmL.SEARCH_PRIORITY.getContainerType())) {
            return false;
        }
        C680290QmJ.LIZ.getClass();
        DetailLynxCardStruct lynxCardStruct = aweme.getLynxCardStruct();
        if (lynxCardStruct == null || lynxCardStruct.dynamicPatch == null || ((Map) C680290QmJ.LIZIZ.getValue()).get(C436190H8n.LIZ(aweme)) != null) {
            return false;
        }
        C680290QmJ.LIZ(aweme, context, c2189821An6, c725770SdT);
        return true;
    }
}
