package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C0DXR;
import X.C0P4V;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C631230OpN;
import X.C632090Oql;
import X.C632700Ork;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.MusicCellSpotlightItemCell;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.SpotlightListViewModel;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.detail.vm.SpotlightProfileDetailShareVM;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellSpotlightSlotAssem;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellSpotlightSlotAssem extends ReusedUISlotAssem<MusicCellSpotlightSlotAssem> implements InterfaceC712990Rxx<C632090Oql> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJLIIIJLLLLLLLZ;
    public final C736950SvV LLJL;
    public final AssemVMLazy LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL;
    public final C632700Ork LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicCellSpotlightSlotAssem.class, "spotlightVM", "getSpotlightVM()Lcom/ss/android/ugc/aweme/music/assem/list/cell/spotlight/SpotlightListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.egn;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0Ork] */
    public MusicCellSpotlightSlotAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1133);
        this.LLJL = new C736950SvV(C13LE.LIZ(SpotlightProfileDetailShareVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(467), new AwS553S0100000_9((AbstractC738140SxQ) this, 1132), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS240S0000000_9.get$arr$(468));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SpotlightListViewModel.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS553S0100000_9(c19719912DlLIZ, 1131), AFwS240S0000000_9.get$arr$(466), null, true);
        this.LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
        this.LLJLL = new Object() { // from class: X.0Ork
            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onReceiveVideoEvent(C737030Svd c737030Svd) {
                boolean zIsSpotlighted;
                List<Aweme> list;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
                List<InterfaceC1891350zJl> listItems;
                LinearLayoutManager linearLayoutManager;
                RecyclerView.LayoutManager layoutManager;
                View viewFindViewByPosition;
                int width;
                int i;
                C631940OqW musicItemModel;
                C631940OqW musicItemModel2;
                C632090Oql c632090Oql = (C632090Oql) C631370Opb.LIZ(this.LIZ);
                if (c632090Oql != null && (musicItemModel2 = c632090Oql.getMusicItemModel()) != null) {
                    zIsSpotlighted = musicItemModel2.isSpotlighted();
                } else {
                    zIsSpotlighted = false;
                }
                C632090Oql c632090Oql2 = (C632090Oql) C631370Opb.LIZ(this.LIZ);
                RecyclerView.LayoutManager layoutManager2 = null;
                if (c632090Oql2 != null && (musicItemModel = c632090Oql2.getMusicItemModel()) != null) {
                    list = musicItemModel.awemes;
                } else {
                    list = null;
                }
                if (zIsSpotlighted && list != null && !list.isEmpty() && (viewOnAttachStateChangeListenerC20604515jv = this.LIZ.LLJJLIIIJLLLLLLLZ) != null && (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) != null && c737030Svd.LIZ == 21) {
                    Object obj = c737030Svd.LIZIZ;
                    if ((obj instanceof Aweme) && obj != null) {
                        MusicCellSpotlightSlotAssem musicCellSpotlightSlotAssem = this.LIZ;
                        int i2 = 0;
                        for (InterfaceC1891350zJl interfaceC1891350zJl : listItems) {
                            if ((interfaceC1891350zJl instanceof C325700Cpk) && Intrinsics.LJFF(((C325700Cpk) interfaceC1891350zJl).LL, obj)) {
                                if (i2 > -1) {
                                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = musicCellSpotlightSlotAssem.LLJJLIIIJLLLLLLLZ;
                                    if (viewOnAttachStateChangeListenerC20604515jv2 != null && (layoutManager = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager()) != null && (viewFindViewByPosition = layoutManager.findViewByPosition(i2)) != null && (width = viewFindViewByPosition.getWidth()) != 0) {
                                        int[] iArr = new int[2];
                                        viewFindViewByPosition.getLocationOnScreen(iArr);
                                        int iLJIIJ = C12ES.LJIIJ(musicCellSpotlightSlotAssem.getContext());
                                        int i3 = iArr[0];
                                        if (i3 < 0) {
                                            i = i3 + width;
                                        } else {
                                            i = iLJIIJ - i3;
                                            if (i >= width) {
                                                i = width;
                                            }
                                        }
                                        if ((i * 1.0f) / width > 0.4f) {
                                            return;
                                        }
                                    }
                                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = musicCellSpotlightSlotAssem.LLJJLIIIJLLLLLLLZ;
                                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                                        layoutManager2 = viewOnAttachStateChangeListenerC20604515jv3.getLayoutManager();
                                    }
                                    if ((layoutManager2 instanceof WrapLinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
                                        linearLayoutManager.scrollToPositionWithOffset(i2, 200);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i2++;
                        }
                    }
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        EventBus.LIZLLL().LJJI(this.LLJLL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this.LLJLL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.vvz);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(MusicCellSpotlightItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C0DXR() { // from class: X.03Ir
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            }
        });
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        viewOnAttachStateChangeListenerC20604515jv.setListConfig(c20603715jn);
        ((AssemListViewModel) this.LLJL.getValue()).setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(((AssemListViewModel) this.LLJL.getValue()).getConfig());
        this.LLJJLIIIJLLLLLLLZ = viewOnAttachStateChangeListenerC20604515jv;
        ViewTreeObserver viewTreeObserver = viewOnAttachStateChangeListenerC20604515jv.getViewTreeObserver();
        if (viewTreeObserver != null) {
            C0P4V c0p4v = new C0P4V(this, 0);
            viewTreeObserver.addOnGlobalLayoutListener(c0p4v);
            C2187701Ajg.LIZ(viewTreeObserver, c0p4v, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C632090Oql c632090Oql) {
        String userId;
        C632090Oql c632090Oql2 = c632090Oql;
        boolean zIsSpotlighted = c632090Oql2.getMusicItemModel().isSpotlighted();
        List<Aweme> list = c632090Oql2.getMusicItemModel().awemes;
        if (zIsSpotlighted) {
            boolean zIsMe = false;
            if (list != null && !list.isEmpty()) {
                C631230OpN.LIZJ(this.LLJJLIIIJLLLLLLLZ);
                SpotlightProfileDetailShareVM spotlightProfileDetailShareVM = (SpotlightProfileDetailShareVM) this.LLJL.getValue();
                OriginMusicArg originMusicArg = (OriginMusicArg) this.LLJLILLLLZIIL.getValue();
                if (originMusicArg != null) {
                    zIsMe = originMusicArg.isMe();
                }
                OriginMusicArg originMusicArg2 = (OriginMusicArg) this.LLJLILLLLZIIL.getValue();
                if (originMusicArg2 == null || (userId = originMusicArg2.getUserId()) == null) {
                    userId = "";
                }
                int iHashCode = hashCode();
                spotlightProfileDetailShareVM.LLILZIL = list;
                spotlightProfileDetailShareVM.LLIZLLLIL = zIsMe;
                spotlightProfileDetailShareVM.LLIZ = userId;
                spotlightProfileDetailShareVM.LLJIJIL = Integer.valueOf(iHashCode);
                spotlightProfileDetailShareVM.manualListRefresh();
                return;
            }
        }
        C631230OpN.LIZ(this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C632090Oql c632090Oql) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C632090Oql c632090Oql) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
