package com.ss.android.ugc.aweme.music.assem;

import X.C019F;
import X.C01GW;
import X.C1252710ihh;
import X.C127G;
import X.C13LE;
import X.C1537050q6J;
import X.C15438062q;
import X.C1551950qUL;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C444920HcY;
import X.C452501pT;
import X.C632050Oqh;
import X.C632210Oqx;
import X.C632410OrH;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634000Otq;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS62S0000000_9;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS218S0300000_9;
import kotlin.jvm.internal.AwS287S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS326S0300000_9;
import wh6.AbS500S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicListArtistCertificationAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 914));
    public final AssemVMLazy LLJI;
    public C127G LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicListArtistCertificationAssem.class, "listViewModel", "getListViewModel()Lcom/ss/android/ugc/aweme/music/vm/OriginMusicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MusicListArtistCertificationAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OriginMusicListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 915), AFwS240S0000000_9.get$arr$(416), null, true);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{OriginMusicListViewModel.class, new AObjectS62S0000000_9(this, 3)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String userId;
        super.onViewCreated(view);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                List<String> list = C632410OrH.LIZJ().preloadChannels;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
                }
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Context context = getContext();
        if (context != null) {
            C632210Oqx.LIZ.getClass();
            User userLIZJ = C632210Oqx.LIZJ();
            if (userLIZJ != null) {
                View viewSd = C786410Ut5.Sd(R.layout.eeo, C786410Ut5.ne(context), null);
                ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJ(0, viewSd);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(2131826697));
                String string = context.getString(2131826696);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) string);
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a04, context)), length, spannableStringBuilder.length(), 33);
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), length, spannableStringBuilder.length(), 33);
                ((TextView) viewSd.findViewById(R.id.s65)).setText(spannableStringBuilder);
                C786410Ut5.I7(new AbS500S0200000_9(this, viewSd, 2), viewSd.findViewById(R.id.s63));
                C786410Ut5.I7(new AbS326S0300000_9(userLIZJ, context, this, 0), viewSd);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "others_homepage");
                OriginMusicArg originMusicArg = (OriginMusicArg) this.LLIZLLLIL.getValue();
                if (originMusicArg == null || (userId = originMusicArg.getUserId()) == null) {
                    userId = "";
                }
                c2344009Gk.LJIIIIZZ("to_user_id", userId);
                String strLIZJ = C632050Oqh.LIZJ(userLIZJ);
                if (strLIZJ == null) {
                    strLIZJ = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, strLIZJ);
                C20684815ws.LJIILLIIL("apply_music_tab_show", c2344009Gk.LIZ);
                C1252710ihh.LJIIJ(this, C13LE.LIZ(InterfaceC634000Otq.class), new C2217381BqS() { // from class: X.0Oq9
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C631640Oq2) obj).LJII;
                    }
                }, new AwS218S0300000_9(viewSd, userLIZJ, this, 6));
                AssemVMLazy assemVMLazy = this.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
                OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) assemVMLazy.getValue();
                AssemViewModel.asyncSubscribe$default(originMusicListViewModel, new C2217381BqS() { // from class: X.0Oqf
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        C632540OrU c632540OrU = (C632540OrU) obj;
                        c632540OrU.getClass();
                        return C627260Oiy.LIZLLL(c632540OrU);
                    }
                }, null, new AwS588S0100000_9(viewSd, 259), null, null, 26, null);
                C736680Sv4.LJIIIIZZ(this, originMusicListViewModel, new C2217381BqS() { // from class: X.0Oqg
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        C632540OrU c632540OrU = (C632540OrU) obj;
                        c632540OrU.getClass();
                        return C627260Oiy.LIZ(c632540OrU);
                    }
                }, C736820SvI.LIZLLL(), new AwS287S0300000_9(viewSd, originMusicListViewModel, userLIZJ, 2), 4);
            }
        }
    }
}
