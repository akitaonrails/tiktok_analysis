package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.preview;

import X.AbstractC21688119uJ;
import X.C0IJT;
import X.C0L68;
import X.C0L69;
import X.C16FS;
import X.C21594519fD;
import X.C21688219uK;
import X.C423520Gj8;
import X.C474500IjA;
import X.C500980Jkm;
import X.C523330Kfj;
import X.C786410Ut5;
import X.InterfaceC469360Ias;
import X.InterfaceC523740KgO;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.preview.PreviewImageDialogFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class PreviewImageDialogFragment extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjHELIOSJ2ExPTYlJyogO2s8LD04O2s8OyolISA7Zx8hLTMlLDgaJSQrLAs6KSkjLgkhKSIhLCEn";
    public LiveIconView LL;
    public C16FS LLILLJJLI;
    public RelativeLayout LLILLL;
    public C21594519fD LLILZ;
    public RecyclerView LLILZIL;
    public C523330Kfj LLIZ;
    public LiveSubMediaModel LLIZLLLIL;
    public final List<LiveSubMediaModel> LLILZLL = new ArrayList();
    public final C0L68 LLJ = new C0L68();
    public final C0L69 LLJI = new C0L69(Integer.valueOf(R.color.f569bc));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C21594519fD NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.f5w) : null;
            this.LLILZ = (C21594519fD) viewFindViewById;
        }
        return (C21594519fD) viewFindViewById;
    }

    public final RecyclerView OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.roa) : null;
            this.LLILZIL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gip);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean onBackPressed() {
        InterfaceC523740KgO interfaceC523740KgO;
        C523330Kfj c523330Kfj = this.LLIZ;
        if (c523330Kfj != null && (interfaceC523740KgO = c523330Kfj.LJFF) != null) {
            interfaceC523740KgO.LIZIZ();
        }
        dismiss();
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final void MR(LiveSubMediaModel liveSubMediaModel) {
        int iIndexOf = ((ArrayList) this.LLILZLL).indexOf(liveSubMediaModel);
        if (iIndexOf >= 0) {
            NR().setCurrentItem(iIndexOf);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void PR(int i, int i2) {
        ((ArrayList) this.LLILZLL).clear();
        ((ArrayList) this.LLILZLL).addAll(this.LLJI.LL);
        this.LLJ.setData(this.LLILZLL);
        MR(this.LLIZLLLIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Map<String, Object> map;
        super.onViewCreated(view, bundle);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_emote_preedit_page_show");
        C523330Kfj c523330Kfj = this.LLIZ;
        if (c523330Kfj != null && (map = c523330Kfj.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c474500IjALIZ.LJJII(entry.getValue().toString(), entry.getKey());
            }
        }
        c474500IjALIZ.LIZ();
        C21594519fD c21594519fDNR = NR();
        if (c21594519fDNR != null) {
            c21594519fDNR.setAdapter(this.LLJ);
        }
        this.LLJI.LLILZ = this;
        final Context context = getContext();
        if (context != null) {
            RecyclerView recyclerViewOR = OR();
            if (recyclerViewOR != null) {
                recyclerViewOR.setLayoutManager(new LinearLayoutManager(context) { // from class: X.14ww
                    {
                        setOrientation(0);
                    }

                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
                        final Context context2 = recyclerView.getContext();
                        C21674119s3 c21674119s3 = new C21674119s3(context2) { // from class: X.14wx
                            @Override // X.C21674119s3
                            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                                return 200.0f / displayMetrics.densityDpi;
                            }

                            @Override // X.C21674119s3
                            public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                                return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                            }
                        };
                        c21674119s3.LIZ = i;
                        startSmoothScroll(c21674119s3);
                    }
                });
            }
            C423520Gj8 c423520Gj8 = new C423520Gj8();
            c423520Gj8.LLILLL = 0L;
            c423520Gj8.LLILZIL = 250L;
            c423520Gj8.LLILZ = 0L;
            c423520Gj8.LLILZLL = 250L;
            RecyclerView recyclerViewOR2 = OR();
            if (recyclerViewOR2 != null) {
                recyclerViewOR2.setItemAnimator(c423520Gj8);
            }
            RecyclerView recyclerViewOR3 = OR();
            if (recyclerViewOR3 != null) {
                recyclerViewOR3.setAdapter(this.LLJI);
            }
            final C0L69 c0l69 = this.LLJI;
            new C21688219uK(new AbstractC21688119uJ(c0l69) { // from class: X.0L6J
                public final C0L69 LIZJ;
                public boolean LIZLLL;

                @Override // X.AbstractC21688119uJ
                public final void LJIILL() {
                }

                {
                    this.LIZJ = c0l69;
                }

                public static void LJIILLIIL(int i) {
                    Context context2 = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                    if (context2 == null) {
                        return;
                    }
                    try {
                        ((Vibrator) C786410Ut5.H2(context2, "vibrator")).vibrate(i);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // X.AbstractC21688119uJ
                public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    PreviewImageDialogFragment previewImageDialogFragment;
                    C0L69 c0l692 = this.LIZJ;
                    if (c0l692.LLILLJJLI != -1) {
                        C0L6A c0l6a = (C0L6A) viewHolder;
                        if (c0l6a.LLILZ != null) {
                            C786410Ut5.qc(c0l6a.LLILZ, 1.0f);
                            C786410Ut5.Pb(c0l6a.LLILZ, 1.0f);
                        }
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int i = c0l692.LLILLJJLI;
                        if (adapterPosition != i && (previewImageDialogFragment = c0l692.LLILZ) != null) {
                            previewImageDialogFragment.PR(i, adapterPosition);
                        }
                        c0l692.LLILLJJLI = -1;
                    }
                    super.LIZJ(recyclerView, viewHolder);
                }

                @Override // X.AbstractC21688119uJ
                public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                    return AbstractC21688119uJ.LJIIIZ(15, 0);
                }

                @Override // X.AbstractC21688119uJ
                public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
                    if (i != 0) {
                        if (viewHolder != null) {
                            LJIILLIIL(100);
                            C0L69 c0l692 = this.LIZJ;
                            c0l692.getClass();
                            C0L6A c0l6a = (C0L6A) viewHolder;
                            if (c0l6a.LLILZ != null) {
                                C786410Ut5.Pb(c0l6a.LLILZ, 1.0f);
                                C786410Ut5.qc(c0l6a.LLILZ, 1.0f);
                            }
                            c0l692.LLILLJJLI = viewHolder.getAdapterPosition();
                            return;
                        }
                        return;
                    }
                    if (viewHolder == null) {
                    }
                }

                @Override // X.AbstractC21688119uJ
                public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    LJIILLIIL(50);
                    C0L69 c0l692 = this.LIZJ;
                    c0l692.getClass();
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition < c0l692.LL.size() && adapterPosition2 >= 0 && adapterPosition2 < c0l692.LL.size()) {
                        c0l692.notifyItemMoved(adapterPosition, adapterPosition2);
                        ListProtector.add(c0l692.LL, adapterPosition2, ListProtector.remove(c0l692.LL, adapterPosition));
                    }
                    return true;
                }

                @Override // X.AbstractC21688119uJ
                public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
                    float height = f2;
                    View view2 = viewHolder.itemView;
                    double height2 = (((double) view2.getHeight()) * 0.25d) / ((double) 2);
                    double top = (((double) viewHolder.itemView.getTop()) - height2) + ((double) height);
                    double height3 = ((double) (viewHolder.itemView.getHeight() * 1.25f)) + top;
                    if (top < 0.0d) {
                        height = -((float) (((double) viewHolder.itemView.getTop()) - height2));
                    } else if (height3 > recyclerView.getHeight()) {
                        height = (float) (((double) recyclerView.getHeight()) - (((double) view2.getBottom()) + height2));
                    }
                    if (i == 2 && !z) {
                        if (this.LIZLLL) {
                            this.LIZLLL = false;
                            this.LIZJ.getClass();
                            viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(AbstractC21688119uJ.LIZLLL(recyclerView, 8)).start();
                            return;
                        }
                        return;
                    }
                    super.LJIIJ(canvas, recyclerView, viewHolder, f, height, i, z);
                    this.LIZLLL = true;
                }
            }).LJ(OR());
        }
        C21594519fD c21594519fDNR2 = NR();
        if (c21594519fDNR2 != null) {
            c21594519fDNR2.addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0L6G
                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f, int i2) {
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    int iIntValue;
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                    LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) C13LP.LJJJLZIJ(i, this.LL.LLJ.LLILLJJLI);
                    if (liveSubMediaModel != null) {
                        PreviewImageDialogFragment previewImageDialogFragment = this.LL;
                        previewImageDialogFragment.LLIZLLLIL = liveSubMediaModel;
                        Integer numLLLFZ = previewImageDialogFragment.LLJI.LLLFZ(liveSubMediaModel);
                        if (numLLLFZ != null && (iIntValue = numLLLFZ.intValue() + 1) >= 0) {
                            RecyclerView recyclerViewOR4 = previewImageDialogFragment.OR();
                            View view2 = null;
                            if (recyclerViewOR4 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerViewOR4.findViewHolderForAdapterPosition(iIntValue)) != null) {
                                view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                            }
                            int i2 = 0;
                            if (view2 == null) {
                                RecyclerView recyclerViewOR5 = previewImageDialogFragment.OR();
                                if (recyclerViewOR5 != null) {
                                    int i3 = iIntValue - 1;
                                    if (i3 > 0) {
                                        i2 = i3;
                                    }
                                    recyclerViewOR5.scrollToPosition(i2);
                                    return;
                                }
                                return;
                            }
                            RecyclerView recyclerViewOR6 = previewImageDialogFragment.OR();
                            if (recyclerViewOR6 == null) {
                                return;
                            }
                            int i4 = iIntValue - 1;
                            if (i4 > 0) {
                                i2 = i4;
                            }
                            recyclerViewOR6.smoothScrollToPosition(i2);
                        }
                    }
                }
            });
        }
        RecyclerView recyclerViewOR4 = OR();
        if (recyclerViewOR4 != null) {
            HandlerHook.viewPost(recyclerViewOR4, new Runnable() { // from class: X.0L6F
                public final void LIZ() {
                    PreviewImageDialogFragment previewImageDialogFragment = this.LL;
                    C0L69 c0l692 = previewImageDialogFragment.LLJI;
                    List<LiveSubMediaModel> list = previewImageDialogFragment.LLILZLL;
                    c0l692.LL.clear();
                    C19719612Di.LJJI(list, c0l692.LL);
                    c0l692.notifyDataSetChanged();
                    PreviewImageDialogFragment previewImageDialogFragment2 = this.LL;
                    previewImageDialogFragment2.LLJ.setData(previewImageDialogFragment2.LLILZLL);
                    PreviewImageDialogFragment previewImageDialogFragment3 = this.LL;
                    previewImageDialogFragment3.LLIZLLLIL = (LiveSubMediaModel) C13LP.LJJJLZIJ(0, previewImageDialogFragment3.LLILZLL);
                    C21594519fD c21594519fDNR3 = this.LL.NR();
                    if (c21594519fDNR3 != null) {
                        c21594519fDNR3.setCurrentItem(0);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreviewImageDialogFragment@1eed.initViewPageAndRecyclerView$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreviewImageDialogFragment@1eed.initViewPageAndRecyclerView$3");
                }
            });
        }
        View viewFindViewById = this.LL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.cnb);
            } else {
                viewFindViewById = null;
            }
            this.LL = (LiveIconView) viewFindViewById;
        }
        C786410Ut5.g8((LiveIconView) viewFindViewById, new View.OnClickListener() { // from class: X.0L6H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.LL.onBackPressed();
            }
        });
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.cpn);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (C16FS) viewFindViewById3;
        }
        C786410Ut5.h8((C16FS) viewFindViewById3, new View.OnClickListener() { // from class: X.0L6D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                InterfaceC523740KgO interfaceC523740KgO;
                PreviewImageDialogFragment previewImageDialogFragment = this.LL;
                C523330Kfj c523330Kfj2 = previewImageDialogFragment.LLIZ;
                if (c523330Kfj2 != null && (interfaceC523740KgO = c523330Kfj2.LJFF) != null) {
                    interfaceC523740KgO.LIZ(new C523320Kfi(previewImageDialogFragment.LLILZLL));
                }
                this.LL.dismiss();
            }
        });
        View view4 = this.LLILLL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.to8);
            }
            this.LLILLL = (RelativeLayout) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C786410Ut5.S7((RelativeLayout) view4, new View.OnClickListener() { // from class: X.166q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view6) {
                FragmentManager fragmentManager;
                Map linkedHashMap;
                AnonymousClass1677 anonymousClass1677;
                final PreviewImageDialogFragment previewImageDialogFragment = this.LL;
                final LiveSubMediaModel liveSubMediaModel = previewImageDialogFragment.LLIZLLLIL;
                if (liveSubMediaModel != null && (fragmentManager = previewImageDialogFragment.getFragmentManager()) != null) {
                    Uri uriLIZ = C010V.LIZ(liveSubMediaModel.getFileLocalUriPath());
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    C523330Kfj c523330Kfj2 = previewImageDialogFragment.LLIZ;
                    if (c523330Kfj2 == null || (linkedHashMap = c523330Kfj2.LJ) == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap2.putAll(linkedHashMap);
                    linkedHashMap2.put("entrance", "album");
                    int i = 1;
                    if (liveSubMediaModel.getEmoteEditFinishParams() != null) {
                        EnumC1782750wUb enumC1782750wUb = EnumC1782750wUb.XY_SCALE_TO_CENTER;
                        EnumC207219166v enumC207219166v = EnumC207219166v.PRE_EDIT;
                        C523330Kfj c523330Kfj3 = previewImageDialogFragment.LLIZ;
                        if (c523330Kfj3 != null) {
                            i = c523330Kfj3.LIZLLL;
                        }
                        if (c523330Kfj3 == null || c523330Kfj3.LIZJ == null) {
                            C0L0G.Companion.getClass();
                        }
                        anonymousClass1677 = new AnonymousClass1677(fragmentManager, enumC1782750wUb, enumC207219166v, i, linkedHashMap2, false, null, uriLIZ, liveSubMediaModel.getEmoteEditFinishParams(), new AnonymousClass1676() { // from class: X.166r
                            @Override // X.AnonymousClass1676
                            public final void LIZ() {
                            }

                            @Override // X.AnonymousClass1676
                            public final void LIZJ(C207221166x c207221166x) {
                                LiveSubMediaModel liveSubMediaModel2 = previewImageDialogFragment.LLIZLLLIL;
                                if (liveSubMediaModel2 != null) {
                                    C207217166t.LIZ(liveSubMediaModel2, c207221166x.LIZ);
                                }
                                LiveSubMediaModel liveSubMediaModel3 = previewImageDialogFragment.LLIZLLLIL;
                                if (liveSubMediaModel3 != null) {
                                    liveSubMediaModel3.setEmoteEditFinishParams(c207221166x);
                                }
                                PreviewImageDialogFragment previewImageDialogFragment2 = previewImageDialogFragment;
                                int iIndexOf = ((ArrayList) previewImageDialogFragment2.LLILZLL).indexOf(liveSubMediaModel);
                                if (iIndexOf >= 0) {
                                    previewImageDialogFragment2.LLJI.notifyItemChanged(iIndexOf);
                                    previewImageDialogFragment2.LLJ.notifyDataSetChanged();
                                }
                            }
                        }, 704);
                    } else {
                        EnumC1782750wUb enumC1782750wUb2 = EnumC1782750wUb.XY_MOVE_TO_CENTER;
                        EnumC207219166v enumC207219166v2 = EnumC207219166v.URI;
                        C523330Kfj c523330Kfj4 = previewImageDialogFragment.LLIZ;
                        if (c523330Kfj4 != null) {
                            i = c523330Kfj4.LIZLLL;
                        }
                        if (c523330Kfj4 == null || c523330Kfj4.LIZJ == null) {
                            C0L0G.Companion.getClass();
                        }
                        anonymousClass1677 = new AnonymousClass1677(fragmentManager, enumC1782750wUb2, enumC207219166v2, i, linkedHashMap2, false, null, uriLIZ, null, new AnonymousClass1676() { // from class: X.166s
                            @Override // X.AnonymousClass1676
                            public final void LIZ() {
                            }

                            @Override // X.AnonymousClass1676
                            public final void LIZJ(C207221166x c207221166x) {
                                LiveSubMediaModel liveSubMediaModel2 = previewImageDialogFragment.LLIZLLLIL;
                                if (liveSubMediaModel2 != null) {
                                    C207217166t.LIZ(liveSubMediaModel2, c207221166x.LIZ);
                                }
                                LiveSubMediaModel liveSubMediaModel3 = previewImageDialogFragment.LLIZLLLIL;
                                if (liveSubMediaModel3 != null) {
                                    liveSubMediaModel3.setEmoteEditFinishParams(c207221166x);
                                }
                                PreviewImageDialogFragment previewImageDialogFragment2 = previewImageDialogFragment;
                                int iIndexOf = ((ArrayList) previewImageDialogFragment2.LLILZLL).indexOf(liveSubMediaModel);
                                if (iIndexOf >= 0) {
                                    previewImageDialogFragment2.LLJI.notifyItemChanged(iIndexOf);
                                    previewImageDialogFragment2.LLJ.notifyDataSetChanged();
                                }
                            }
                        }, 1728);
                    }
                    ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).iQ1(anonymousClass1677);
                }
            }
        });
    }
}
