package com.ss.android.ugc.aweme.ecommerce.search.vision.record.album;

import X.AbstractC214823195h;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C12ES;
import X.C1309500kBI;
import X.C1336500ksq;
import X.C1336530kst;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559040qfm;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770206wW;
import X.C1770850wBP;
import X.C189200o6;
import X.C19471811Ga;
import X.C19471911Gb;
import X.C19474211Gy;
import X.C19677511yn;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1A3X;
import X.C2217381BqS;
import X.C275210AqV;
import X.C337180DJs;
import X.C338490DOt;
import X.C345780Dh2;
import X.C424820GlE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C675940QfI;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObserverS235S0100000_33;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchShootingPageOptConfigs;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.EcPermissionVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.permission.IEcPermissionAbility;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import irm.AkS99S0100000_33;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS160S0110000_33;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class AlbumPreviewFragment extends AmeBaseFragment implements InterfaceC344240DeY, InterfaceC1058150ddt, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+Kid9HELIOSPiw/ICA9ZjcpKiAhLGstJS0mJWsNJS0mJRU+LDk6LTIKOy40JSAiPQ==";
    public RecyclerView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;
    public View LLILZIL;
    public LinearLayout LLILZLL;
    public C197039127h LLIZ;
    public TuxIconView LLIZLLLIL;
    public C424820GlE LLJ;
    public EcPhotoSearchAlbumVM LLJI;
    public InterfaceC1631630sYr<? super MediaModel, ? super Integer, ? super Bitmap, ? super Long, Unit> LLJIJIL;
    public InterfaceC1631630sYr<? super SysRecommendModel, ? super SysRecommendFeedItem, ? super Integer, ? super String, Unit> LLJILJIL;
    public PhotoSearchEnterParams LLJILJILJ;
    public String LLJILLL;
    public final AssemVMLazy LLJJ;
    public C19677511yn LLJJI;
    public C1336500ksq LLJJIII;
    public C1559040qfm LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AlbumPreviewFragment.class, "permissionVM", "getPermissionVM()Lcom/ss/android/ugc/aweme/ecommerce/search/vision/record/permission/EcPermissionVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public AlbumPreviewFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EcPermissionVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2061);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(97);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS577S0100000_33, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2062), aFwS279S0000000_33, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS577S0100000_33, new AwS577S0100000_33((Fragment) this, 2063), aFwS279S0000000_33, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS577S0100000_33, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2064), aFwS279S0000000_33, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
    }

    public final void MR(boolean z) {
        RecyclerView recyclerView;
        float f;
        if (this.LLJ == null) {
            return;
        }
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            float[] fArr = new float[2];
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 180.0f;
            }
            fArr[0] = f;
            if (z) {
                f2 = 180.0f;
            }
            fArr[1] = f2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "rotation", fArr);
            objectAnimatorOfFloat.setDuration(300L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        if (z) {
            C424820GlE c424820GlE = this.LLJ;
            if (c424820GlE != null && (recyclerView = this.LL) != null) {
                Pair pair = new Pair(Integer.valueOf(recyclerView.getMeasuredWidth()), Integer.valueOf(recyclerView.getMeasuredHeight()));
                c424820GlE.setWidth(((Number) pair.getFirst()).intValue());
                c424820GlE.setHeight(((Number) pair.getSecond()).intValue());
                c424820GlE.showAsDropDown(recyclerView, 0, 0);
                c424820GlE.LJJIIJ(pair, true);
                c424820GlE.LLILZ = true;
                return;
            }
            return;
        }
        C424820GlE c424820GlE2 = this.LLJ;
        if (c424820GlE2 == null) {
            return;
        }
        c424820GlE2.hide();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJJIJIIJIL = false;
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b5069", (String) null);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (5 == i && !this.LLJJIJIIJIL) {
            C675940QfI.LIZJ("album_photo_click", this.LLJILJILJ, new AwS612S0100000_33(this, 56));
            this.LLJJIJIIJIL = true;
        }
    }

    public final void NR(Context context, List list) {
        if (context == null) {
            return;
        }
        if (list.isEmpty()) {
            C424820GlE c424820GlE = this.LLJ;
            if (c424820GlE != null) {
                c424820GlE.hide();
            }
            this.LLJJIII = null;
            this.LLJ = null;
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                return;
            }
            return;
        }
        C1336500ksq c1336500ksq = this.LLJJIII;
        if (c1336500ksq == null) {
            this.LLJJIII = new C1336500ksq(list, new AwS399S0200000_33(this, context, 46));
        } else {
            c1336500ksq.LL = list;
            c1336500ksq.notifyDataSetChanged();
        }
        if (this.LLJ == null) {
            C424820GlE c424820GlE2 = new C424820GlE(context);
            C1336500ksq c1336500ksq2 = this.LLJJIII;
            if (c1336500ksq2 != null) {
                c424820GlE2.LLILLJJLI.setAdapter(c1336500ksq2);
            }
            this.LLJ = c424820GlE2;
        }
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZJ;
        NextLiveData<List<MediaModel>> nextLiveData;
        NextLiveData<List<MediaModel>> nextLiveData2;
        InterfaceC1631630sYr<? super MediaModel, ? super Integer, ? super Bitmap, ? super Long, Unit> interfaceC1631630sYr;
        View view2;
        Context context;
        List list;
        boolean z;
        boolean zLIZJ2;
        Context context2;
        super.onViewCreated(view, bundle);
        this.LL = (RecyclerView) view.findViewById(R.id.hui);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.lwo);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.bn2);
        this.LLILZIL = view.findViewById(R.id.dna);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.tb1);
        this.LLIZ = (C197039127h) view.findViewById(R.id.j3f);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.e2k);
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLIZ = C19471911Gb.LIZ(getActivity());
        this.LLJI = ecPhotoSearchAlbumVMLIZ;
        if (ecPhotoSearchAlbumVMLIZ != null && (interfaceC1631630sYr = this.LLJIJIL) != null && (view2 = this.LLILZIL) != null && (context = view2.getContext()) != null) {
            C1309500kBI c1309500kBI = ecPhotoSearchAlbumVMLIZ.LL.get("All");
            if (C275210AqV.LIZ() || c1309500kBI != null) {
                TuxIconView tuxIconView = this.LLILZ;
                if (tuxIconView != null) {
                    C786410Ut5.I7(new AkS99S0100000_33(this, 2), tuxIconView);
                }
                View view3 = this.LLILZIL;
                if (view3 != null) {
                    C786410Ut5.I7(new AkS99S0100000_33(this, 3), view3);
                }
                TuxTextView tuxTextView = this.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(C1336530kst.LIZ(getContext(), "All"));
                }
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                PhotoSearchEnterParams photoSearchEnterParamsJ80 = null;
                IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IEcPreviewViewAbility.class, null);
                if (iEcPreviewViewAbility != null) {
                    photoSearchEnterParamsJ80 = iEcPreviewViewAbility.j80();
                }
                if (c1309500kBI == null || (list = c1309500kBI.LIZIZ) == null) {
                    list = C13BV.INSTANCE;
                }
                Context context3 = getContext();
                if (context3 == null) {
                    z = false;
                } else {
                    C1A3X.LIZ.getClass();
                    if (!C1A3X.LIZIZ(context3) && C1A3X.LIZ(context3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this.LLJJI = new C19677511yn(viewLifecycleOwner, photoSearchEnterParamsJ80, list, z, new AwS434S0200000_33(this, ecPhotoSearchAlbumVMLIZ, 167), new C1770206wW(interfaceC1631630sYr, (InterfaceC1631630sYr<? super MediaModel, ? super Integer, ? super Bitmap, ? super Long, Unit>) 5));
                RecyclerView recyclerView = this.LL;
                if (recyclerView != null) {
                    final Context context4 = recyclerView.getContext();
                    WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(context4) { // from class: com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment$configUI$5$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                        public final boolean canScrollVertically() {
                            return true;
                        }
                    };
                    wrapGridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.18QJ
                        @Override // X.AbstractC214823195h
                        public final int LJFF(int i) {
                            return 1;
                        }
                    };
                    recyclerView.setLayoutManager(wrapGridLayoutManager);
                    recyclerView.setAdapter(this.LLJJI);
                    recyclerView.addItemDecoration(new C345780Dh2(4, (int) C12ES.LIZJ(1.0f, recyclerView.getContext()), false));
                }
                if (!C275210AqV.LIZ()) {
                    if (!ecPhotoSearchAlbumVMLIZ.LL.values().isEmpty()) {
                        this.LLJJIII = new C1336500ksq(C13LP.LLIIII(ecPhotoSearchAlbumVMLIZ.LL.values()), new AwS612S0100000_33(this, 228));
                        C424820GlE c424820GlE = new C424820GlE(context);
                        C1336500ksq c1336500ksq = this.LLJJIII;
                        if (c1336500ksq != null) {
                            c424820GlE.LLILLJJLI.setAdapter(c1336500ksq);
                        }
                        this.LLJ = c424820GlE;
                        TuxIconView tuxIconView2 = this.LLILLL;
                        if (tuxIconView2 != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                        }
                    } else {
                        TuxIconView tuxIconView3 = this.LLILLL;
                        if (tuxIconView3 != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
                        }
                    }
                } else {
                    NR(context, C13LP.LLIIII(ecPhotoSearchAlbumVMLIZ.LL.values()));
                }
                C1559040qfm c1559040qfm = this.LLJJIJI;
                if (c1559040qfm != null) {
                    zLIZJ2 = c1559040qfm.LLILLL;
                } else {
                    zLIZJ2 = ECSearchPhotoSearchShootingPageOptConfigs.LIZJ();
                }
                if (zLIZJ2 && (context2 = getContext()) != null) {
                    C1A3X.LIZ.getClass();
                    if (!C1A3X.LIZIZ(context2) && C1A3X.LIZ(context2)) {
                        C19471811Ga.LIZ.getClass();
                        if (!C19471811Ga.LIZIZ) {
                            LinearLayout linearLayout = this.LLILZLL;
                            if (linearLayout != null) {
                                C337180DJs.LIZJ(linearLayout);
                            }
                            final C197039127h c197039127h = this.LLIZ;
                            if (c197039127h != null) {
                                c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 852));
                                C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.1A2B
                                    @Override // X.AbstractViewOnClickListenerC1173120gdK
                                    public final void LIZ(View view4) {
                                        C675940QfI.LIZJ("photo_search_limit_access_page_click", this.LLILZ.LLJILJILJ, AFwS279S0000000_33.get$arr$(395));
                                        IEcPermissionAbility iEcPermissionAbility = (IEcPermissionAbility) C1558520qew.LIZ(C1558360qeg.LJ(c197039127h, null), IEcPermissionAbility.class, null);
                                        if (iEcPermissionAbility != null) {
                                            iEcPermissionAbility.Pr();
                                        }
                                    }
                                }, c197039127h);
                                C675940QfI.LIZJ("photo_search_limit_access_page_show", this.LLJILJILJ, AFwS279S0000000_33.get$arr$(396));
                            }
                            TuxIconView tuxIconView4 = this.LLIZLLLIL;
                            if (tuxIconView4 != null) {
                                C786410Ut5.I7(new AkS99S0100000_33(this, 4), tuxIconView4);
                            }
                        }
                    }
                }
            }
        }
        C1559040qfm c1559040qfm2 = this.LLJJIJI;
        if (c1559040qfm2 != null) {
            zLIZJ = c1559040qfm2.LLILLL;
        } else {
            zLIZJ = ECSearchPhotoSearchShootingPageOptConfigs.LIZJ();
        }
        if (!C275210AqV.LIZ()) {
            if (zLIZJ) {
                AssemVMLazy assemVMLazy = this.LLJJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
                C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.1A2I
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1A2G) obj).LLILLJJLI);
                    }
                }, null, new AwS647S0100000_33(this, 48), 6);
                EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = this.LLJI;
                if (ecPhotoSearchAlbumVM != null && (nextLiveData2 = ecPhotoSearchAlbumVM.LLILZ) != null) {
                    nextLiveData2.observe(getViewLifecycleOwner(), new AObserverS235S0100000_33(this, 3));
                    return;
                }
                return;
            }
            return;
        }
        AssemVMLazy assemVMLazy2 = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.1A2J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1A2G) obj).LLILLJJLI);
            }
        }, null, new AwS160S0110000_33(this, zLIZJ, 1), 6);
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM2 = this.LLJI;
        if (ecPhotoSearchAlbumVM2 == null || (nextLiveData = ecPhotoSearchAlbumVM2.LLILZ) == null) {
            return;
        }
        nextLiveData.observe(getViewLifecycleOwner(), new AObserverS235S0100000_33(this, 69));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.boi, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
