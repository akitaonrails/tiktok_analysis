package com.ss.android.ugc.aweme.ttsvoice.ui;

import X.AbstractC480470Isn;
import X.C01GW;
import X.C0XF1;
import X.C11VK;
import X.C11VU;
import X.C1258150iqT;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C1394940mP6;
import X.C13LE;
import X.C1401640mZu;
import X.C1401730ma3;
import X.C16FB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19369010q8;
import X.C19418810yA;
import X.C19418910yB;
import X.C19419110yD;
import X.C19419210yE;
import X.C19419410yG;
import X.C19422210yi;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C427870Gq9;
import X.C446980Hfs;
import X.C452070Ho5;
import X.C487820JBc;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1400710mYP;
import X.InterfaceC1401600mZq;
import X.InterfaceC19369110q9;
import X.InterfaceC19400810vG;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS141S0100000_6;
import Y.ATListenerS348S0200000_29;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.audiomode.vopclone.experiment.VopSignUpConfig;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.tools.detail.IVoiceReuseService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;
import com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSVoiceDetailsFragment extends BaseDetailFragment {
    public static final C1394940mP6 LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjE4Ojk8HELIOSISYpZzo6ZhEYGhk8ISYpDSonKSwgOgkhKSIhLCEn";
    public C1401730ma3 LL;
    public C1401640mZu LLILLJJLI;
    public RelativeLayout LLILLL;
    public RelativeLayout LLILZ;
    public C1749280vcc LLILZIL;
    public TTSVoiceDetailAwemeListFragment LLILZLL;
    public C16FB LLIZ;
    public ViewGroup LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public C427870Gq9 LLJJIII;
    public View LLJJIJI;
    public Music LLJJJ;
    public boolean LLJJJIL;
    public final AssemVMLazy LLJJJJJIL;
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public int LLJJJJ = -1;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mP6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TTSVoiceDetailsFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ttsvoice/viewmodel/TTSVoiceDetailsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = new Object() { // from class: X.0mP6
        };
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getLabelName(int i) {
        return "tts_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final int getResId() {
        return R.layout.fuk;
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getShootWayLabel() {
        return "tts_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return false;
    }

    public final TTSVoiceDetailsViewModel RR() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (TTSVoiceDetailsViewModel) assemVMLazy.getValue();
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
        boolean z = fragmentLJJJJZI instanceof TTSVoiceDetailAwemeListFragment;
        Object obj = fragmentLJJJJZI;
        if (!z) {
            String str = this.LLJJIJIIJIL;
            InterfaceC1400710mYP interfaceC1400710mYP = new InterfaceC1400710mYP() { // from class: X.0mUd
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
                    c1398410mUh.LIZ = "from_tts_page";
                    c1398410mUh.LIZIZ = "voice_id";
                    return c1398410mUh;
                }

                @Override // X.InterfaceC1400710mYP
                public C1255920ims<? extends AbstractC1255880imo<?, ?>> getPresenter(int i, C19EG c19eg) {
                    C1255920ims<? extends AbstractC1255880imo<?, ?>> c1255920ims = new C1255920ims<>();
                    c1255920ims.LJIIJ(new AnonymousClass1120());
                    return c1255920ims;
                }

                @Override // X.InterfaceC1400710mYP
                public C1398630mV3 onCreateDetailAwemeViewHolder(final View view, final String str2, final InterfaceC1260110itd interfaceC1260110itd) {
                    return new C1398630mV3(view, str2, interfaceC1260110itd) { // from class: X.0mV5
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
            TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment = new TTSVoiceDetailAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("detail_aweme_list_type", 33);
            C786410Ut5.LJJJI("event_label", "tts_page", bundle);
            C786410Ut5.LJJJI("detail_id", str, bundle);
            tTSVoiceDetailAwemeListFragment.setArguments(bundle);
            tTSVoiceDetailAwemeListFragment.LLLILZJ = interfaceC1400710mYP;
            tTSVoiceDetailAwemeListFragment.LLLFFI = this.mCurPos == 0;
            tTSVoiceDetailAwemeListFragment.LLLFZ = true;
            obj = tTSVoiceDetailAwemeListFragment;
        }
        TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment2 = (TTSVoiceDetailAwemeListFragment) obj;
        this.LLILZLL = tTSVoiceDetailAwemeListFragment2;
        List<InterfaceC19400810vG> list = this.mFragments;
        if (tTSVoiceDetailAwemeListFragment2 == null) {
            tTSVoiceDetailAwemeListFragment2 = null;
        }
        list.add(tTSVoiceDetailAwemeListFragment2);
        List<AmeBaseFragment> list2 = this.mFragmentList;
        TTSVoiceDetailAwemeListFragment tTSVoiceDetailAwemeListFragment3 = this.LLILZLL;
        list2.add(tTSVoiceDetailAwemeListFragment3 != null ? tTSVoiceDetailAwemeListFragment3 : null);
        this.mFragmentTypes.add(33);
        return new C1258150iqT(getChildFragmentManager(), this.mFragmentList, this.mFragmentTypes);
    }

    public TTSVoiceDetailsFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TTSVoiceDetailsViewModel.class);
        this.LLJJJJJIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS565S0100000_21(c19719912DlLIZ, 837), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 838), AFwS273S0000000_29.get$arr$(196));
    }

    public final void UR() {
        RR().vQ2().pause();
        IVoiceReuseService iVoiceReuseServiceLIZLLL = TTSVoiceRecordService.LIZLLL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        C19EG c19egRequireActivity = requireActivity();
        Music music = this.LLJJJ;
        iVoiceReuseServiceLIZLLL.LIZIZ(viewLifecycleOwner, c19egRequireActivity, music, music != null ? music.convertToMusicModel() : null, this.LLJJIJIL, this.LLJJIJIIJIL, "ttsvoice_detail_fragment_tag");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        RR().vQ2().pause();
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final String getCurId() {
        return this.LLJJIJIIJIL;
    }

    public final void PR(Context context) {
        C19419110yD.LIZ.getClass();
        if (C19419110yD.LIZ()) {
            C19418810yA.LIZIZ.LIZ(context, "voice_anchor");
            return;
        }
        C19418910yB.LIZ.getClass();
        if (!C19418910yB.LIZ()) {
            return;
        }
        final String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
        C19419210yE.LIZ.getClass();
        C01GW c01gw = C19419210yE.LIZIZ;
        if (((Keva) c01gw.getValue()).getInt("is_first_enter", 1) == 1) {
            C19419210yE.LIZ(1, "voice_anchor", curUserId);
            ((Keva) c01gw.getValue()).storeInt("is_first_enter", 0);
        } else {
            C19419210yE.LIZ(0, "voice_anchor", curUserId);
        }
        String str = ((VopSignUpConfig) C19418910yB.LIZJ.getValue()).webUrl;
        if (str == null) {
            str = "";
        }
        SmartRouter.buildRoute(context, str).open(0, new OnActivityResultCallback() { // from class: X.10y9
            @Override // com.bytedance.router.OnActivityResultCallback
            public final void onActivityResult(int i, int i2, Intent intent) {
                C19419210yE c19419210yE = C19419210yE.LIZ;
                String str2 = curUserId;
                c19419210yE.getClass();
                C19419210yE.LIZIZ("voice_anchor", str2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void SR(com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment.SR(com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final InterfaceC19369110q9 createAnimator(ViewGroup viewGroup) {
        InterfaceC1401600mZq interfaceC1401600mZq = null;
        if (C19422210yi.LIZJ()) {
            C1401730ma3 c1401730ma3 = this.LL;
            if (c1401730ma3 != null) {
                interfaceC1401600mZq = c1401730ma3;
            }
            return interfaceC1401600mZq.LIZ(viewGroup);
        }
        C1401640mZu c1401640mZu = this.LLILLJJLI;
        if (c1401640mZu != null) {
            interfaceC1401600mZq = c1401640mZu;
        }
        return interfaceC1401600mZq.LIZ(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initArguments(Bundle bundle) {
        Serializable serializable;
        String string;
        String str = "";
        if (bundle != null && (string = bundle.getString("voice_id", "")) != null) {
            str = string;
        }
        this.LLJJIJIIJIL = str;
        Music music = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("music_model");
        } else {
            serializable = null;
        }
        if (serializable instanceof Music) {
            music = (Music) serializable;
        }
        this.LLJJJ = music;
        if (bundle != null) {
            bundle.getString("audio_tool_origin_from");
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment
    public final void initView(View view) {
        CreativeToolsPluginService creativeToolsPluginService;
        TextView textView;
        TuxIconView tuxIconView;
        super.initView(view);
        this.LLILZ = (RelativeLayout) view.findViewById(R.id.y1z);
        this.LLILZIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLIZ = (C16FB) view.findViewById(R.id.t25);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.jit);
        this.LLJI = view.findViewById(R.id.vop_title_btn);
        this.LLJIJIL = view.findViewById(R.id.vop_icon_btn);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = this.LLIZLLLIL;
        RelativeLayout relativeLayout = null;
        C1401730ma3 c1401730ma3 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ful, viewGroup, true);
        this.LLJ = viewTd;
        if (viewTd == null) {
            viewTd = null;
        }
        this.LLJILJIL = (TuxIconView) viewTd.findViewById(R.id.qn9);
        View view2 = this.LLJ;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJILJILJ = (TuxIconView) view2.findViewById(R.id.asf);
        View view3 = this.LLJ;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJILLL = (TuxTextView) view3.findViewById(R.id.voice_title);
        View view4 = this.LLJ;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJJ = (TuxTextView) view4.findViewById(R.id.voice_creator);
        View view5 = this.LLJ;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJJI = (TuxTextView) view5.findViewById(R.id.view_count);
        View view6 = this.LLJ;
        if (view6 == null) {
            view6 = null;
        }
        this.LLJJIII = (C427870Gq9) view6.findViewById(R.id.voice_cover);
        View view7 = this.LLJ;
        if (view7 == null) {
            view7 = null;
        }
        this.LLJJIJI = view7.findViewById(R.id.voice_tts_label_container);
        this.LLILLL = (RelativeLayout) view.findViewById(R.id.vza);
        this.LLILLJJLI = new C1401640mZu(requireContext(), getLayoutInflater(), 2131822400);
        this.LL = new C1401730ma3(requireContext(), getLayoutInflater());
        if (C19422210yi.LIZJ() && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LJI(getActivity())) {
            C1401730ma3 c1401730ma32 = this.LL;
            if (c1401730ma32 == null) {
                c1401730ma32 = null;
            }
            RelativeLayout relativeLayout2 = this.LLILLL;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            c1401730ma32.LIZJ(relativeLayout2);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ej, requireContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C1401730ma3 c1401730ma33 = this.LL;
                if (c1401730ma33 == null) {
                    c1401730ma33 = null;
                }
                String string = requireContext().getString(2131858351);
                View view8 = c1401730ma33.LIZJ;
                if (view8 != null) {
                    textView = (TextView) view8.findViewById(R.id.kz2);
                    if (textView != null) {
                        textView.setText(string);
                    }
                } else {
                    textView = null;
                }
                View view9 = c1401730ma33.LIZJ;
                if (view9 != null) {
                    tuxIconView = (TuxIconView) view9.findViewById(R.id.kz3);
                    if (tuxIconView != null) {
                        tuxIconView.setIconRes(R.raw.icon_ai_self);
                    }
                } else {
                    tuxIconView = null;
                }
                if (textView != null) {
                    textView.setTextColor(iIntValue);
                }
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(iIntValue);
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.szt);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.kzu);
            C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) new AwS608S0100000_29(this, 881), 163), constraintLayout);
            C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) new AwS608S0100000_29(this, 882), 163), constraintLayout2);
            C1401730ma3 c1401730ma34 = this.LL;
            if (c1401730ma34 != null) {
                c1401730ma3 = c1401730ma34;
            }
            c1401730ma3.getClass();
            c1401730ma3.LIZLLL = new C19419410yG(constraintLayout2.findViewById(R.id.kz1));
            c1401730ma3.LJ = new C19419410yG(constraintLayout.findViewById(R.id.vz_));
            C19419410yG c19419410yG = c1401730ma3.LIZLLL;
            if (c19419410yG != null) {
                c19419410yG.LIZIZ(AFwS218S0000000_29.get$arr$(402));
            }
            C19419410yG c19419410yG2 = c1401730ma3.LJ;
            if (c19419410yG2 != null) {
                c19419410yG2.LIZIZ(AFwS218S0000000_29.get$arr$(402));
            }
            constraintLayout2.setOnTouchListener(new ATListenerS348S0200000_29(c1401730ma3, constraintLayout2, 3));
            constraintLayout.setOnTouchListener(new ATListenerS348S0200000_29(c1401730ma3, constraintLayout, 4));
            C11VK.LIZ.getClass();
            C11VK.LJ("VDP", "show", false);
            return;
        }
        C1401640mZu c1401640mZu = this.LLILLJJLI;
        if (c1401640mZu == null) {
            c1401640mZu = null;
        }
        RelativeLayout relativeLayout3 = this.LLILLL;
        if (relativeLayout3 != null) {
            relativeLayout = relativeLayout3;
        }
        c1401640mZu.LIZJ(relativeLayout);
        C786410Ut5.I7(new ACListenerS141S0100000_6((Function1) new AwS608S0100000_29(this, 883), 163), view.findViewById(R.id.vz7));
    }

    public final void cb(boolean z, boolean z2) {
        C16FB c16fb = null;
        if (!isViewValid()) {
            C16FB c16fb2 = this.LLIZ;
            if (c16fb2 != null) {
                c16fb = c16fb2;
            }
            c16fb.setRefreshing(false);
            return;
        }
        C1749280vcc c1749280vcc = this.LLILZIL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        if (!C0XF1.LIZLLL(requireContext())) {
            C1389890mGx c1389890mGx = new C1389890mGx(this);
            c1389890mGx.LJIIIZ(2131837962);
            c1389890mGx.LJIIJJI();
            C1749280vcc c1749280vcc2 = this.LLILZIL;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS573S0100000_29(this, 530));
            c1749280vcc2.setStatus(c1722300uv6);
            C16FB c16fb3 = this.LLIZ;
            if (c16fb3 != null) {
                c16fb = c16fb3;
            }
            c16fb.setRefreshing(false);
            return;
        }
        C1749280vcc c1749280vcc3 = this.LLILZIL;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        c1749280vcc3.LJ();
        TTSVoiceDetailsViewModel tTSVoiceDetailsViewModelRR = RR();
        C23250099c.LIZLLL(tTSVoiceDetailsViewModelRR.getAssemVMScope(), null, null, new C487820JBc(tTSVoiceDetailsViewModelRR, this.LLJJIJIIJIL, null), 3);
        List<InterfaceC19400810vG> list = this.mFragments;
        if (!z || list == null) {
            return;
        }
        Iterator<InterfaceC19400810vG> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().cb(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScroll(int i, int i2) {
        ColorDrawable colorDrawable;
        super.onScroll(i, i2);
        int i3 = this.LLJJJJ;
        ViewGroup viewGroup = this.LLIZLLLIL;
        View view = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (i3 != viewGroup.getBottom()) {
            ViewGroup viewGroup2 = this.LLIZLLLIL;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            viewGroup2.getBottom();
            this.mTitleColorCtrl.getBottom();
            RelativeLayout relativeLayout = this.LLILZ;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            relativeLayout.getHeight();
            C11VU.LIZIZ(20.0f, requireContext());
            ViewGroup viewGroup3 = this.LLIZLLLIL;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            this.LLJJJJ = viewGroup3.getBottom();
        }
        RelativeLayout relativeLayout2 = this.LLILZ;
        if (relativeLayout2 == null) {
            relativeLayout2 = null;
        }
        if (i == 0) {
            RelativeLayout relativeLayout3 = this.LLILZ;
            if (relativeLayout3 == null) {
                relativeLayout3 = null;
            }
            colorDrawable = new ColorDrawable(C446980Hfs.LIZ(relativeLayout3.getContext(), R.color.a1d));
        } else {
            RelativeLayout relativeLayout4 = this.LLILZ;
            if (relativeLayout4 == null) {
                relativeLayout4 = null;
            }
            colorDrawable = new ColorDrawable(C960203pA.LIZ(R.attr.bx, relativeLayout4.getContext()));
        }
        relativeLayout2.setBackground(colorDrawable);
        float f = i;
        float f2 = 1;
        float f3 = f / f2;
        float f4 = 0.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        C786410Ut5.S4(f3, this.mTitle);
        this.LLJJJIL = C19369010q8.LIZ(f3, this.LLJJJIL, this);
        float f5 = f / i2;
        if (f5 >= 0.0f) {
            if (f5 > 1.0f) {
                f4 = 1.0f;
            } else {
                f4 = f5;
            }
        }
        C19419110yD.LIZ.getClass();
        if (C19419110yD.LIZ()) {
            View view2 = this.LLJI;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.T4(view2, f2 - f4);
            View view3 = this.LLJIJIL;
            if (f4 == 1.0f) {
                if (view3 != null) {
                    view = view3;
                }
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                if (view3 != null) {
                    view = view3;
                }
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.AbstractDetailFragment, X.InterfaceC1260330itz
    public final void onScrolled(float f, float f2) {
        this.LLJJJIL = C19369010q8.LIZIZ(f, f2, this.LLJJJIL, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    @Override // com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment, com.ss.android.ugc.aweme.detail.AbstractDetailFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            super.onViewCreated(r13, r14)
            java.lang.String r0 = r12.LLJJIJIIJIL
            int r0 = r0.length()
            r3 = 0
            if (r0 != 0) goto L16
            X.19EG r0 = r12.getActivity()
            if (r0 == 0) goto L15
            r0.finish()
        L15:
            return
        L16:
            android.widget.TextView r2 = r12.mTitle
            r0 = 0
            X.C786410Ut5.S4(r0, r2)
            Y.ACListenerS163S0100000_29 r1 = new Y.ACListenerS163S0100000_29
            r0 = 321(0x141, float:4.5E-43)
            r1.<init>(r12, r0)
            X.C786410Ut5.T7(r2, r1)
            android.widget.ImageView r4 = r12.mBackBtn
            kotlin.jvm.internal.AwS586S0100000_7 r2 = new kotlin.jvm.internal.AwS586S0100000_7
            r0 = 576(0x240, float:8.07E-43)
            r2.<init>(r12, r0)
            Y.ACListenerS141S0100000_6 r1 = new Y.ACListenerS141S0100000_6
            r0 = 163(0xa3, float:2.28E-43)
            r1.<init>(r2, r0)
            X.C786410Ut5.I7(r1, r4)
            X.16FB r1 = r12.LLIZ
            r8 = 0
            if (r1 != 0) goto L3f
            r1 = r8
        L3f:
            X.10o9 r0 = X.EnumC19356710o9.NONE
            r1.setOverScrollMode(r0)
            X.0Itk r0 = X.EnumC481060Itk.NONE
            r1.setScrollMode(r0)
            r1.setNestedHeader(r8)
            com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel r0 = r12.RR()
            androidx.lifecycle.MutableLiveData r4 = r0.LLILZ
            androidx.lifecycle.LifecycleOwner r2 = r12.getViewLifecycleOwner()
            Y.AObserverS224S0100000_21 r1 = new Y.AObserverS224S0100000_21
            r0 = 108(0x6c, float:1.51E-43)
            r1.<init>(r12, r0)
            r4.observe(r2, r1)
            com.ss.android.ugc.aweme.ttsvoice.viewmodel.TTSVoiceDetailsViewModel r4 = r12.RR()
            X.0wBP r6 = new X.0wBP
            r6.<init>()
            r0 = 29
            kotlin.jvm.internal.AFwS290S0000000_7 r0 = kotlin.jvm.internal.AFwS290S0000000_7.get$arr$(r0)
            r6.LIZIZ = r0
            X.0Jzz r5 = new X.C2217381BqS() { // from class: X.0Jzz
                static {
                    /*
                        X.0Jzz r0 = new X.0Jzz
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Jzz) X.0Jzz.LL X.0Jzz
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C510410Jzz.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.0JBZ> r3 = X.C0JBZ.class
                        java.lang.String r2 = "getResponse()Lcom/bytedance/assem/arch/extensions/Async;"
                        r1 = 0
                        java.lang.String r0 = "response"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C510410Jzz.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.0JBZ r2 = (X.C0JBZ) r2
                        X.06Xk<com.ss.android.ugc.aweme.ttsvoice.model.TTSVoiceDetailsResponse> r0 = r2.LL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C510410Jzz.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS608S0100000_29 r7 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 879(0x36f, float:1.232E-42)
            r7.<init>(r12, r0)
            kotlin.jvm.internal.AwS608S0100000_29 r9 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 880(0x370, float:1.233E-42)
            r9.<init>(r12, r0)
            r10 = 8
            r11 = r8
            com.bytedance.assem.arch.viewModel.AssemViewModel.asyncSubscribe$default(r4, r5, r6, r7, r8, r9, r10, r11)
            X.10yD r0 = X.C19419110yD.LIZ
            r0.getClass()
            boolean r0 = X.C19419110yD.LIZ()
            if (r0 != 0) goto L9d
            X.10yB r0 = X.C19418910yB.LIZ
            r0.getClass()
            boolean r0 = X.C19418910yB.LIZ()
            if (r0 == 0) goto Lc3
        L9d:
            android.view.View r0 = r12.LLJI
            if (r0 != 0) goto La2
            r0 = r8
        La2:
            X.C786410Ut5.LJLLLLLL(r3, r0)
            android.view.View r2 = r12.LLJI
            if (r2 != 0) goto Laa
            r2 = r8
        Laa:
            wh6.AbS708S0100000_29 r1 = new wh6.AbS708S0100000_29
            r0 = 8
            r1.<init>(r12, r0)
            X.C786410Ut5.I7(r1, r2)
            android.view.View r0 = r12.LLJIJIL
            if (r0 == 0) goto Lb9
            r8 = r0
        Lb9:
            wh6.AbS708S0100000_29 r1 = new wh6.AbS708S0100000_29
            r0 = 9
            r1.<init>(r12, r0)
            X.C786410Ut5.I7(r1, r8)
        Lc3:
            r12.cb(r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ttsvoice.ui.TTSVoiceDetailsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
