package com.ss.android.ugc.aweme.voiceconversion.ui;

import X.AbstractC480470Isn;
import X.C0XF1;
import X.C1258150iqT;
import X.C1389890mGx;
import X.C1394930mP5;
import X.C13LE;
import X.C1401640mZu;
import X.C16FB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C1893080zMY;
import X.C19369010q8;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C427870Gq9;
import X.C452070Ho5;
import X.C487840JBe;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC19356710o9;
import X.EnumC481060Itk;
import X.InterfaceC1400710mYP;
import X.InterfaceC19369110q9;
import X.InterfaceC19400810vG;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS155S0100000_21;
import Y.AObserverS224S0100000_21;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.voiceconversion.viewmodel.VoiceConversionConversionDetailsViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class VoiceConversionDetailsFragment extends BaseDetailFragment {
    public static final C1394930mP5 LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMjICw2KyoiPyohOyHELIOSwjJ2EmIWsaJiYwLQYjJzk2OjYlJiEXLTEtICMgDjctLiI2JjE=";
    public C1401640mZu LL;
    public RelativeLayout LLILLJJLI;
    public RelativeLayout LLILLL;
    public C1749280vcc LLILZ;
    public VoiceConversionDetailAwemeListFragment LLILZIL;
    public C16FB LLILZLL;
    public ViewGroup LLIZ;
    public View LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public C427870Gq9 LLJILLL;
    public Music LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final AssemVMLazy LLJJJ;
    public String LLJJ = "";
    public String LLJJI = "";
    public String LLJJIII = "";
    public int LLJJIJIL = -1;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mP5] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VoiceConversionDetailsFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/voiceconversion/viewmodel/VoiceConversionConversionDetailsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = new Object() { // from class: X.0mP5
        };
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "vc_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.fui;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "vc_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final VoiceConversionConversionDetailsViewModel PR() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (VoiceConversionConversionDetailsViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final AbstractC480470Isn getFragmentPagerAdapter() {
        this.mFragments = new ArrayList();
        this.mFragmentList = new ArrayList();
        this.mFragmentTypes = new ArrayList();
        FragmentManager childFragmentManager = getChildFragmentManager();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(AbstractDetailFragment.FRAGMENT_TAG);
        sbLIZ.append('0');
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = fragmentLJJJJZI instanceof VoiceConversionDetailAwemeListFragment;
        Object obj = fragmentLJJJJZI;
        if (!z) {
            String str = this.LLJJ;
            InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP() { // from class: X.0mUe
                public static final int $stable = 0;

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme, int i) {
                    return C635990Ox3.LIZ(this, c1398410mUh, aweme, i);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ C1255920ims getPresenter(int i, C19EG c19eg, InterfaceC214902198i interfaceC214902198i) {
                    return C635990Ox3.LIZJ(this, i, c19eg, interfaceC214902198i);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void interceptSmartRoute(View view, int i, SmartRoute smartRoute, Aweme aweme, C1398410mUh c1398410mUh) {
                    C635990Ox3.LIZLLL(this, view, i, smartRoute, aweme, c1398410mUh);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ boolean needCallHolderAttached(RecyclerView.ViewHolder viewHolder) {
                    return C635990Ox3.LJ(this, viewHolder);
                }

                @Override // X.InterfaceC1400710mYP
                public /* bridge */ /* synthetic */ void onJumpToDetail(String str2) {
                    C635990Ox3.LJFF(this, str2);
                }

                @Override // X.InterfaceC1400710mYP
                public boolean sendCustomRequest(C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims, int i) {
                    return false;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398410mUh getJumpToVideoParam(C1398410mUh c1398410mUh, Aweme aweme) {
                    c1398410mUh.LIZ = "from_voice_conversion_page";
                    c1398410mUh.LIZIZ = "voice_conversion_id";
                    return c1398410mUh;
                }

                @Override // X.InterfaceC1400710mYP
                public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
                    C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                    c1255920ims.LJIIJ(new C1401670mZx());
                    return c1255920ims;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398630mV3 onCreateDetailAwemeViewHolder(final View view, final String str2, final InterfaceC1260110itd interfaceC1260110itd) {
                    return new C1398630mV3(view, str2, interfaceC1260110itd) { // from class: X.0mV6
                        @Override // X.C1398630mV3
                        public final void b6(Aweme aweme, int i, boolean z2, Bundle bundle) {
                            boolean z3;
                            super.b6(aweme, i, z2, bundle);
                            if (aweme != null) {
                                if (aweme.isPgcShow()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    List<AwemeTextLabelModel> list = aweme.textTopLabels;
                                    if (list != null && list.size() > 0) {
                                        C786410Ut5.LLIL(this.LLJIJIL, 0);
                                        C786410Ut5.l(this.LLJI, 8);
                                        C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) C13LP.LJJJJZI(aweme.getTextTopLabels()));
                                        return;
                                    }
                                    return;
                                }
                                if (aweme == null) {
                                    return;
                                }
                                if (aweme.getOriginAuthor() != null) {
                                    C786410Ut5.LLIL(this.LLJILJIL, 0);
                                    if (C123100dR.LIZ(AwemeBizExtKt.getLabelOriginAuthorText(aweme))) {
                                        this.LLJILJIL.setText(AwemeBizExtKt.getLabelOriginAuthorText(aweme));
                                    }
                                    C786410Ut5.l(this.LLJI, 4);
                                    return;
                                }
                                if (aweme == null || aweme.getMusicStarter() != null || aweme == null || aweme.getOriginAuthor() != null || aweme == null || aweme.getIsTop() != 1) {
                                    return;
                                }
                                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                                    C786410Ut5.LLIL(this.LLJIJIL, 0);
                                    C786410Ut5.l(this.LLJI, 8);
                                    C1398630mV3.r6(this.LLJIJIL, (AwemeTextLabelModel) C13LP.LJJJJZI(aweme.getTextTopLabels()));
                                } else {
                                    C786410Ut5.LLIL(this.LLJIJIL, 8);
                                    C786410Ut5.l(this.LLJI, 0);
                                    C1324840ka2.LJI(this.LLJI, aweme.getLabelTop(), (int) C12ES.LIZJ(6.0f, this.LLIZ), (int) C12ES.LIZJ(6.0f, this.LLIZ), null);
                                }
                            }
                        }
                    };
                }
            };
            VoiceConversionDetailAwemeListFragment voiceConversionDetailAwemeListFragment = new VoiceConversionDetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", 72);
            C786410Ut5.LJJJI("event_label", "vc_page", bundle);
            C786410Ut5.LJJJI("detail_id", str, bundle);
            voiceConversionDetailAwemeListFragment.setArguments(bundle);
            voiceConversionDetailAwemeListFragment.LLLILZJ = interfaceC1400710mYP;
            voiceConversionDetailAwemeListFragment.LLLFFI = this.mCurPos == 0;
            voiceConversionDetailAwemeListFragment.LLLFZ = true;
            obj = voiceConversionDetailAwemeListFragment;
        }
        VoiceConversionDetailAwemeListFragment voiceConversionDetailAwemeListFragment2 = (VoiceConversionDetailAwemeListFragment) obj;
        this.LLILZIL = voiceConversionDetailAwemeListFragment2;
        List<InterfaceC19400810vG> list = this.mFragments;
        if (voiceConversionDetailAwemeListFragment2 == null) {
            voiceConversionDetailAwemeListFragment2 = null;
        }
        list.add(voiceConversionDetailAwemeListFragment2);
        List<AmeBaseFragment> list2 = this.mFragmentList;
        VoiceConversionDetailAwemeListFragment voiceConversionDetailAwemeListFragment3 = this.LLILZIL;
        list2.add(voiceConversionDetailAwemeListFragment3 != null ? voiceConversionDetailAwemeListFragment3 : null);
        this.mFragmentTypes.add(72);
        return new C1258150iqT(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
    }

    public VoiceConversionDetailsFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VoiceConversionConversionDetailsViewModel.class);
        this.LLJJJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS565S0100000_21(c19719912DlLIZ, 1072), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1073), AFwS259S0000000_21.get$arr$(285));
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        PR().vQ2().pause();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        return this.LLJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RR(com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse r11) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsFragment.RR(com.ss.android.ugc.aweme.voiceconversion.model.VoiceConversionDetailsResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final InterfaceC19369110q9 createAnimator(ViewGroup viewGroup) {
        C1401640mZu c1401640mZu = this.LL;
        if (c1401640mZu == null) {
            c1401640mZu = null;
        }
        return c1401640mZu.LIZ(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        Serializable serializable;
        String string;
        String str = "";
        if (bundle != null && (string = bundle.getString("anchor_id", "")) != null) {
            str = string;
        }
        this.LLJJ = str;
        Music music = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("music_model");
        } else {
            serializable = null;
        }
        if (serializable instanceof Music) {
            music = (Music) serializable;
        }
        this.LLJJIJI = music;
        if (bundle != null) {
            bundle.getString("audio_tool_origin_from");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initView(View view) {
        super.initView(view);
        this.LLILLL = (RelativeLayout) view.findViewById(R.id.y1z);
        this.LLILZ = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLILZLL = (C16FB) view.findViewById(R.id.t25);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.jit);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = this.LLIZ;
        RelativeLayout relativeLayout = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fuj, viewGroup, true);
        this.LLIZLLLIL = viewTd;
        if (viewTd == null) {
            viewTd = null;
        }
        this.LLJ = (TuxIconView) viewTd.findViewById(R.id.qn9);
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJI = (TuxTextView) view2.findViewById(R.id.voice_title);
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJIJIL = (TuxTextView) view3.findViewById(R.id.voice_creator);
        View view4 = this.LLIZLLLIL;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJILJIL = (TuxTextView) view4.findViewById(R.id.voice_content_explain);
        View view5 = this.LLIZLLLIL;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJILJILJ = (TuxTextView) view5.findViewById(R.id.view_count);
        View view6 = this.LLIZLLLIL;
        if (view6 == null) {
            view6 = null;
        }
        this.LLJILLL = (C427870Gq9) view6.findViewById(R.id.voice_cover);
        this.LLILLJJLI = (RelativeLayout) view.findViewById(R.id.vza);
        C1401640mZu c1401640mZu = new C1401640mZu(requireContext(), getLayoutInflater(), 2131822400);
        this.LL = c1401640mZu;
        RelativeLayout relativeLayout2 = this.LLILLJJLI;
        if (relativeLayout2 != null) {
            relativeLayout = relativeLayout2;
        }
        c1401640mZu.LIZJ(relativeLayout);
        C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) new AwS600S0100000_21(this, 205), 95), view.findViewById(R.id.vz7));
    }

    public final void cb(boolean z, boolean z2) {
        C16FB c16fb = null;
        if (!isViewValid()) {
            C16FB c16fb2 = this.LLILZLL;
            if (c16fb2 != null) {
                c16fb = c16fb2;
            }
            c16fb.setRefreshing(false);
            return;
        }
        C1749280vcc c1749280vcc = this.LLILZ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        if (!C0XF1.LIZLLL(requireContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            C1749280vcc c1749280vcc2 = this.LLILZ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS565S0100000_21(this, 1071));
            c1749280vcc2.setStatus(c1722300uv6);
            C16FB c16fb3 = this.LLILZLL;
            if (c16fb3 != null) {
                c16fb = c16fb3;
            }
            c16fb.setRefreshing(false);
            return;
        }
        C1749280vcc c1749280vcc3 = this.LLILZ;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        c1749280vcc3.LJ();
        VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModelPR = PR();
        C23250099c.LIZLLL(voiceConversionConversionDetailsViewModelPR.getAssemVMScope(), null, null, new C487840JBe(voiceConversionConversionDetailsViewModelPR, this.LLJJ, null), 3);
        List<InterfaceC19400810vG> list = this.mFragments;
        if (!z || list == null) {
            return;
        }
        Iterator<InterfaceC19400810vG> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().cb(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[PHI: r1
      0x0059: PHI (r1v3 float) = (r1v2 float), (r1v4 float) binds: [B:23:0x0051, B:25:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(int r6, int r7) {
        /*
            r5 = this;
            super.onScroll(r6, r7)
            int r1 = r5.LLJJIJIL
            android.view.ViewGroup r0 = r5.LLIZ
            r4 = 0
            if (r0 != 0) goto Lb
            r0 = r4
        Lb:
            int r0 = r0.getBottom()
            if (r1 == r0) goto L3a
            android.view.ViewGroup r0 = r5.LLIZ
            if (r0 != 0) goto L16
            r0 = r4
        L16:
            r0.getBottom()
            android.view.View r0 = r5.mTitleColorCtrl
            r0.getBottom()
            android.widget.RelativeLayout r0 = r5.LLILLL
            if (r0 != 0) goto L23
            r0 = r4
        L23:
            r0.getHeight()
            android.content.Context r1 = r5.requireContext()
            r0 = 1101004800(0x41a00000, float:20.0)
            X.C11VU.LIZIZ(r0, r1)
            android.view.ViewGroup r0 = r5.LLIZ
            if (r0 != 0) goto L34
            r0 = r4
        L34:
            int r0 = r0.getBottom()
            r5.LLJJIJIL = r0
        L3a:
            android.widget.RelativeLayout r3 = r5.LLILLL
            if (r3 != 0) goto L3f
            r3 = r4
        L3f:
            if (r6 != 0) goto L68
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r0 = 0
            r2.<init>(r0)
        L47:
            r3.setBackground(r2)
            float r2 = (float) r6
            r0 = 1
            float r0 = (float) r0
            float r2 = r2 / r0
            r1 = 0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L59
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5a
        L59:
            r2 = r1
        L5a:
            android.widget.TextView r0 = r5.mTitle
            X.C786410Ut5.S4(r2, r0)
            boolean r0 = r5.LLJJIJIIJIL
            boolean r0 = X.C19369010q8.LIZ(r2, r0, r5)
            r5.LLJJIJIIJIL = r0
            return
        L68:
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.widget.RelativeLayout r0 = r5.LLILLL
            if (r0 == 0) goto L6f
            r4 = r0
        L6f:
            android.content.Context r1 = r4.getContext()
            r0 = 2131099676(0x7f06001c, float:1.7811712E38)
            int r0 = X.C960203pA.LIZ(r0, r1)
            r2.<init>(r0)
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.voiceconversion.ui.VoiceConversionDetailsFragment.onScroll(int, int):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
        this.LLJJIJIIJIL = C19369010q8.LIZIZ(f, f2, this.LLJJIJIIJIL, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLJJ.length() == 0) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        TextView textView = this.mTitle;
        C786410Ut5.S4(0.0f, textView);
        C786410Ut5.T7(textView, new ACListenerS155S0100000_21(this, 109));
        C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) new AwS586S0100000_7(this, 326), 95), this.mBackBtn);
        C16FB c16fb = this.LLILZLL;
        if (c16fb == null) {
            c16fb = null;
        }
        c16fb.setOverScrollMode(EnumC19356710o9.NONE);
        c16fb.setScrollMode(EnumC481060Itk.NONE);
        c16fb.setNestedHeader(null);
        PR().LLILZ.observe(getViewLifecycleOwner(), new AObserverS224S0100000_21(this, 51));
        VoiceConversionConversionDetailsViewModel voiceConversionConversionDetailsViewModelPR = PR();
        C1770850wBP c1770850wBP = new C1770850wBP();
        c1770850wBP.LIZIZ = AFwS290S0000000_7.get$arr$(14);
        AssemViewModel.asyncSubscribe$default(voiceConversionConversionDetailsViewModelPR, new C2217381BqS() { // from class: X.0K00
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C487800JBa) obj).LL;
            }
        }, c1770850wBP, new AwS600S0100000_21(this, 203), null, new AwS600S0100000_21(this, 204), 8, null);
        cb(false, false);
    }
}
