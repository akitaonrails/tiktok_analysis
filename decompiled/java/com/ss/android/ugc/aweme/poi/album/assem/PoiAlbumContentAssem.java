package com.ss.android.ugc.aweme.poi.album.assem;

import X.C019F;
import X.C01GW;
import X.C0DXR;
import X.C1185350gx3;
import X.C1186600gz4;
import X.C1186610gz5;
import X.C1192290h8F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS18S0300000_18;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumPageApi;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumLargeImageCell;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumMediumImageCell;
import com.ss.android.ugc.aweme.poi.album.cell.PoiAlbumTabCell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 760));
    public final AssemVMLazy LLJ;
    public final C1559260qg8 LLJI;
    public final List<Integer> LLJIJIL;
    public final List<C1186600gz4> LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiAlbumContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/album/PoiAlbumViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiAlbumContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiAlbumViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 759), AFwS256S0000000_18.get$arr$(251), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1185350gx3.class, "PoiAlbumHierarchyData"), checkSupervisorPrepared());
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = new ArrayList();
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 758));
    }

    public final C1185350gx3 Go() {
        return (C1185350gx3) this.LLJI.getValue();
    }

    public final C1186610gz5 Ho() {
        return (C1186610gz5) this.LLIZLLLIL.getValue();
    }

    public final PoiAlbumViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (PoiAlbumViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = Ho().LLILLJJLI;
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiAlbumLargeImageCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(PoiAlbumMediumImageCell.class);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(staggeredGridLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.0GmT
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int headerCount;
                int size;
                int iLIZIZ;
                C21681819tI c21681819tI;
                int iLIZIZ2;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2;
                List<InterfaceC1891350zJl> listItems;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = null;
                if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                    viewOnAttachStateChangeListenerC20604515jv3 = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                }
                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                    headerCount = viewOnAttachStateChangeListenerC20604515jv3.getHeaderCount();
                } else {
                    headerCount = 0;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition < headerCount) {
                    return;
                }
                if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv2 = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null && (listItems = viewOnAttachStateChangeListenerC20604515jv2.getListItems()) != null) {
                    size = listItems.size();
                } else {
                    size = 0;
                }
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                if (childAdapterPosition == size - 1) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                    if (c21681819tI.LLILLJJLI) {
                        if (childAdapterPosition > 0) {
                            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                        } else {
                            iLIZIZ2 = 0;
                        }
                        rect.set(0, iLIZIZ2, 0, iLIZIZ);
                        return;
                    }
                    if (c21681819tI.LIZ() == 0) {
                        rect.set(0, 0, iLIZIZ3, iLIZIZ);
                    } else {
                        rect.set(iLIZIZ3, 0, 0, iLIZIZ);
                    }
                }
            }
        });
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS18S0300000_18(this, viewOnAttachStateChangeListenerC20604515jv, staggeredGridLayoutManager, 0));
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = Ho().LLILLL;
        viewOnAttachStateChangeListenerC20604515jv2.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(PoiAlbumTabCell.class);
        viewOnAttachStateChangeListenerC20604515jv2.addItemDecoration(new C0DXR() { // from class: X.0DXu
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int headerCount;
                int size;
                int i;
                int i2;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3;
                List<InterfaceC1891350zJl> listItems;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = null;
                if (recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) {
                    viewOnAttachStateChangeListenerC20604515jv4 = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView;
                }
                if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                    headerCount = viewOnAttachStateChangeListenerC20604515jv4.getHeaderCount();
                } else {
                    headerCount = 0;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                if (childAdapterPosition < headerCount) {
                    return;
                }
                if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv3 = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null && (listItems = viewOnAttachStateChangeListenerC20604515jv3.getListItems()) != null) {
                    size = listItems.size();
                } else {
                    size = 0;
                }
                if (childAdapterPosition == 0) {
                    i = 16;
                } else {
                    i = 0;
                }
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i));
                if (childAdapterPosition == size - 1) {
                    i2 = 16;
                } else {
                    i2 = 8;
                }
                rect.set(iLIZIZ, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)), 0);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv2.getContext());
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(linearLayoutManager);
        C1192290h8F.LIZ(this, "poi_album", null, true, null, Ho().LL, 10);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 221));
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gyT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1186500gyu) obj).LL;
            }
        }, this, null, null, null, new AwS597S0100000_18(this, 766), 28, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0gz6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1186500gyu) obj).LLILLJJLI;
            }
        }, null, new AwS632S0100000_18(this, 233), 6);
    }

    public final void Lo(int i, List list) {
        boolean z;
        ((ArrayList) this.LLJILJIL).clear();
        if (list != null) {
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PoiAlbumPageApi.CategoryTabInfo categoryTabInfo = (PoiAlbumPageApi.CategoryTabInfo) obj;
                    List<C1186600gz4> list2 = this.LLJILJIL;
                    if (i2 == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((ArrayList) list2).add(new C1186600gz4(categoryTabInfo, z));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Ho().LLILLL.getState().LJIILL(this.LLJILJIL, null);
    }
}
