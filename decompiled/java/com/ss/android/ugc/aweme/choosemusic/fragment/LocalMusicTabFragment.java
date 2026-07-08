package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC683590Qrd;
import X.AnonymousClass0956;
import X.C0P6P;
import X.C0PEM;
import X.C0VSJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1390920mIc;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1399150mVt;
import X.C13DL;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C15GR;
import X.C15GU;
import X.C15H0;
import X.C15HO;
import X.C15HP;
import X.C15IC;
import X.C15IE;
import X.C15IK;
import X.C15IN;
import X.C15KM;
import X.C1691430u7J;
import X.C19342110ln;
import X.C19514711Wn;
import X.C19514811Wo;
import X.C196858120i;
import X.C196859120j;
import X.C196863120n;
import X.C19719512Dh;
import X.C19EG;
import X.C20448614zs;
import X.C20491015Ga;
import X.C20494415Hi;
import X.C20494715Hl;
import X.C20533215Wg;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C23250099c;
import X.C2344009Gk;
import X.C323580CmK;
import X.C462980IDo;
import X.C616540OGe;
import X.C629710Omv;
import X.C7740030o;
import X.C786410Ut5;
import X.C817503Hh;
import X.C838410Wul;
import X.C985403tE;
import X.EnumC1399740mWq;
import X.EnumC20491915Gj;
import X.InterfaceC1258040iqI;
import X.InterfaceC1399770mWt;
import X.InterfaceC1523405xo;
import X.InterfaceC19515111Wr;
import X.InterfaceC20492315Gn;
import X.ProgressDialogC1399760mWs;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import com.ss.android.ugc.aweme.external.IExternalAlbumService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class LocalMusicTabFragment extends BaseMusicListFragment<C20448614zs> implements C15GU<C20448614zs>, C0P6P, InterfaceC1258040iqI, InterfaceC1523405xo {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkJiAgLSg5OiHELIOSYwZiM+KCg+LSs4ZwM8KyQgBDogISYYKC0VOiQrJCo9PA==";
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C15H0 LLJJIJIIJIL;
    public AnonymousClass0956 LLJJJIL;
    public ProgressDialogC1399760mWs LLJJJJ;
    public long LLJJIJIL = -1;
    public final ArrayList<MusicModel> LLJJJ = new ArrayList<>();
    public final Keva LLJJJJJIL = Keva.getRepo("local_music_repo");
    public final Gson LLJJJJLIIL = C7740030o.LIZ().getGson();

    @Override // X.C0P6P
    public final void LJJIFFI() {
    }

    @Override // X.InterfaceC20492515Gp
    public final String LJLI() {
        return "local_music_list_data";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String OR() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean PR() {
        return false;
    }

    @Override // X.InterfaceC20492515Gp
    public final String R3() {
        return "local_music_list_load_more_status";
    }

    @Override // X.C15GU
    public final void b1() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getLayoutId() {
        return R.layout.c99;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int getPageType() {
        return 6;
    }

    @Override // X.InterfaceC20492515Gp
    public final String vu() {
        return "local_music_list_status";
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        Object obj = this.LLIZLLLIL;
        if (obj == null) {
            return null;
        }
        return ((C15GR) obj).LIZIZ;
    }

    public final MusicModel[] WR() {
        try {
            MusicModel[] musicModelArr = (MusicModel[]) this.LLJJJJLIIL.LJII(this.LLJJJJJIL.getString("imported_device_sounds", ""), MusicModel[].class);
            return musicModelArr == null ? new MusicModel[0] : musicModelArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new MusicModel[0];
        }
    }

    @Override // X.C15GU
    public final void LJIJ() {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public final boolean VR() {
        C19EG activity = getActivity();
        if (activity != null) {
            return C838410Wul.LIZ(activity, Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        }
        return false;
    }

    public final void gS() {
        ((C20494715Hl) NR()).LLLIIIIL();
        C15H0 c15h0 = this.LLJJIJIIJIL;
        if (c15h0 != null) {
            c15h0.p8(null);
        }
        ImportDeviceSoundsFragment importDeviceSoundsFragment = new ImportDeviceSoundsFragment();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = importDeviceSoundsFragment;
        c1390920mIc.LJIIIIZZ(4);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(getChildFragmentManager(), "start AudioChoose Page");
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20492515Gp
    public final void initData() {
        super.initData();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        this.LLJJIJI = C838410Wul.LIZ(activity, Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0;
        Object obj = this.LLILZLL.get("local_music_list_data");
        if (obj != null) {
            this.LLILZLL.zQ2(obj, "local_music_list_data");
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(LocalMusicTabFragment.class.getName());
        }
        super.onResume();
        if (VR() != this.LLJJIJI) {
            ZR(getContext(), null);
        }
    }

    @Override // X.C15GU
    public final void refreshData() {
        ZR(getContext(), null);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC20494515Hj
    public final /* bridge */ /* synthetic */ void LLIIL(C15HP c15hp) {
        LLIIL(c15hp);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC20492315Gn<C20448614zs> MR(View view) {
        C20491015Ga c20491015Ga = new C20491015Ga(getContext(), view, this, 2131838158, this, this, this.LLJJI, EnumC20491915Gj.LOCAL_MUSIC, this.LLJILLL);
        C786410Ut5.LLLLZLLLI(c20491015Ga.LIZ, 8);
        c20491015Ga.LJIIIIZZ(this.LLJJIJIIJIL);
        c20491015Ga.LJII(this);
        c20491015Ga.LJIILIIL = C629710Omv.LIZ(this);
        c20491015Ga.LJIIJ(new Pair<>(Long.valueOf(this.LLJIJIL), Long.valueOf(this.LLJILJIL)));
        C15HO c15ho = new C15HO("change_music_page", "upload", "", C15IK.LIZ);
        c15ho.LJIILIIL = "your_sounds";
        c20491015Ga.LJIIIZ(c15ho);
        return c20491015Ga;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* JADX INFO: renamed from: SR */
    public final void LLIIL(C15HP c15hp) {
        String str;
        TokenCert tokenCertWith;
        String str2;
        String str3;
        C19EG activity = getActivity();
        if (activity != null && (str = c15hp.LIZIZ) != null) {
            boolean z = true;
            String str4 = "off";
            switch (str.hashCode()) {
                case -1657672896:
                    if (str.equals("allow_access_button_click")) {
                        C19342110ln.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C15IE.LIZ(c2344009Gk);
                        C20684815ws.LJIILLIIL("click_upload_music_access_allow", c2344009Gk.LIZ);
                        C462980IDo c462980IDo = new C462980IDo(this, 0);
                        C19514811Wo c19514811Wo = C19514711Wn.LIZIZ;
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 33) {
                            tokenCertWith = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_allow_access_target33");
                        } else {
                            tokenCertWith = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_allow_access");
                        }
                        C19514711Wn c19514711WnLIZIZ = c19514811Wo.LIZIZ(activity, tokenCertWith);
                        String[] strArr = new String[1];
                        if (i >= 33) {
                            str2 = "android.permission.READ_MEDIA_AUDIO";
                        } else {
                            str2 = "android.permission.READ_EXTERNAL_STORAGE";
                        }
                        strArr[0] = str2;
                        c19514711WnLIZIZ.LIZIZ(strArr).LIZJ(c462980IDo);
                    }
                    break;
                case -751140062:
                    if (str.equals("local_music_delete_click")) {
                        MusicModel musicModel = c15hp.LIZ;
                        int i2 = c15hp.LIZLLL;
                        ((C20494715Hl) NR()).LLLIIIIL();
                        C15H0 c15h0 = this.LLJJIJIIJIL;
                        if (c15h0 != null) {
                            c15h0.p8(null);
                        }
                        int i3 = i2 - 2;
                        if (musicModel.getMusicType() == 0) {
                            if (Boolean.valueOf(((HashSet) ((C20494715Hl) NR()).LLJJJJ).contains(musicModel.getLocalPath())).booleanValue()) {
                                bS(i3, musicModel, cS(i3), false);
                            }
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                        c1397580mTM.LJFF(2131825028);
                        c1397580mTM.LIZIZ(activity.getString(2131825027));
                        C985403tE.LIZ(c1397580mTM, new AwS112S0201000_31(this, i3, musicModel, 19));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    break;
                case -552821657:
                    if (str.equals("local_edit_click")) {
                        C20494715Hl c20494715Hl = (C20494715Hl) NR();
                        c20494715Hl.LLJJJ = !c20494715Hl.LLJJJ;
                        c20494715Hl.notifyDataSetChanged();
                        c20494715Hl.LLLIIIIL();
                        C15H0 c15h02 = this.LLJJIJIIJIL;
                        if (c15h02 != null) {
                            c15h02.p8(null);
                        }
                        C19342110ln.LIZ.getClass();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        C15IE.LIZ(c2344009Gk2);
                        C20684815ws.LJIILLIIL("click_upload_music_manage", c2344009Gk2.LIZ);
                    }
                    break;
                case -233745933:
                    if (str.equals("import_sounds_from_device_click")) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        boolean zVR = VR();
                        C19342110ln.LIZ.getClass();
                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                        C15IE.LIZ(c2344009Gk3);
                        if (zVR) {
                            str4 = "on";
                        }
                        c2344009Gk3.LJFF("system_music_authorization_status", str4);
                        C20684815ws.LJIILLIIL("click_import_sound_from_device_entrance", c2344009Gk3.LIZ);
                        if (zVR) {
                            gS();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            boolean z2 = this.LLJJJJJIL.getBoolean("device_sounds_import_page_entered_first_time", true);
                            C2344009Gk c2344009Gk4 = new C2344009Gk();
                            C15IE.LIZ(c2344009Gk4);
                            c2344009Gk4.LJFF("system_music_authorization_status", "on");
                            c2344009Gk4.LIZLLL(jCurrentTimeMillis2, "duration");
                            c2344009Gk4.LIZJ(z2 ? 1 : 0, "is_first_time");
                            C20684815ws.LJIILLIIL("enter_upload_local_music_page", c2344009Gk4.LIZ);
                            this.LLJJJJJIL.storeBoolean("device_sounds_import_page_entered_first_time", false);
                        } else {
                            dS("import_sounds_from_device_click");
                        }
                    }
                    break;
                case 1477711545:
                    if (str.equals("import_sound_from_video_click")) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (jCurrentTimeMillis3 - this.LLJJIJIL >= 1000) {
                            this.LLJJIJIL = jCurrentTimeMillis3;
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 34) {
                                str3 = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
                            } else if (i4 >= 33) {
                                str3 = "android.permission.READ_MEDIA_VIDEO";
                            } else {
                                str3 = "android.permission.WRITE_EXTERNAL_STORAGE";
                            }
                            C19EG activity2 = getActivity();
                            if (activity2 == null || C838410Wul.LIZ(activity2, str3) != 0 || !VR()) {
                                z = false;
                            }
                            C19342110ln.LIZ.getClass();
                            C2344009Gk c2344009Gk5 = new C2344009Gk();
                            C15IE.LIZ(c2344009Gk5);
                            if (z) {
                                str4 = "on";
                            }
                            c2344009Gk5.LJFF("system_photo_authorization_status", str4);
                            C20684815ws.LJIILLIIL("click_import_sound_from_video_entrance", c2344009Gk5.LIZ);
                            if (z) {
                                System.currentTimeMillis();
                                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "extract music", new C15IN(activity));
                                long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                                C2344009Gk c2344009Gk6 = new C2344009Gk();
                                C15IE.LIZ(c2344009Gk6);
                                c2344009Gk6.LJFF("system_photo_authorization_status", "on");
                                c2344009Gk6.LIZLLL(jCurrentTimeMillis4, "duration");
                                C20684815ws.LJIILLIIL("enter_upload_video_music_page", c2344009Gk6.LIZ);
                            } else {
                                dS("import_sound_from_video_click");
                            }
                            break;
                        }
                    }
                    break;
            }
        }
    }

    @Override // X.InterfaceC1523405xo
    public final void UA(ArrayList<MusicModel> arrayList) {
        Context context = getContext();
        if (!arrayList.isEmpty() && context != null) {
            ProgressDialogC1399760mWs progressDialogC1399760mWs = new ProgressDialogC1399760mWs(context, EnumC1399740mWq.GONE, 0);
            C1399150mVt.LIZ(context, progressDialogC1399760mWs);
            progressDialogC1399760mWs.setMessage(context.getString(2131826433));
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C196858120i(this, arrayList, progressDialogC1399760mWs, null), 2);
            C19342110ln c19342110ln = C19342110ln.LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator<MusicModel> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getMusicId());
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ", ", null, null, 0, null, null, 62);
            c19342110ln.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C15IE.LIZ(c2344009Gk);
            c2344009Gk.LJFF("fake_music_id", strLJJLIIIJ);
            c2344009Gk.LIZJ(1, "is_selected_uploadable_content");
            C20684815ws.LJIILLIIL("upload_sound_from_device", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void aS(boolean r12) {
        /*
            r11 = this;
            X.14zw r4 = new X.14zw
            r4.<init>()
            r7 = 865(0x361, float:1.212E-42)
            r10 = 866(0x362, float:1.214E-42)
            r6 = 0
            r9 = 1
            java.lang.String r5 = "list_data"
            if (r12 == 0) goto L5d
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r8 = r11.LLJJJ
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.14zs r0 = new X.14zs
            r2 = 12
            r0.<init>(r10, r6, r2)
            r3.add(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L52
            X.14zs r0 = new X.14zs
            r0.<init>(r7, r6, r2)
            r3.add(r0)
        L2e:
            java.util.List r0 = X.C15KM.LIZIZ(r8)
            r3.addAll(r0)
            r4.LIZIZ(r5, r3)
        L38:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.util.HashMap<K, V> r1 = r4.LIZ
            java.lang.String r0 = "list_hasmore"
            r1.put(r0, r2)
            java.lang.String r1 = "action_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.LIZIZ(r1, r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r11.LLILZLL
            java.lang.String r0 = "local_music_list_data"
            r1.zQ2(r4, r0)
            return
        L52:
            X.14zs r1 = new X.14zs
            r0 = 862(0x35e, float:1.208E-42)
            r1.<init>(r0, r6, r2)
            r3.add(r1)
            goto L2e
        L5d:
            r0 = 2
            X.14zs[] r3 = new X.C20448614zs[r0]
            X.14zs r2 = new X.14zs
            r1 = 14
            r2.<init>(r10, r6, r1)
            r0 = 0
            r3[r0] = r2
            X.14zs r0 = new X.14zs
            r0.<init>(r7, r6, r1)
            r3[r9] = r0
            java.util.ArrayList r0 = X.C1697810uHb.LJ(r3)
            r4.LIZIZ(r5, r0)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment.aS(boolean):void");
    }

    public final boolean cS(int i) {
        MusicModel[] musicModelArrWR = WR();
        if (i < 0 || i >= musicModelArrWR.length) {
            return false;
        }
        C1691430u7J.LIZ(i, musicModelArrWR.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(musicModelArrWR, 0, i);
        int length = musicModelArrWR.length;
        C1691430u7J.LIZ(length, musicModelArrWR.length);
        hS(C13LQ.LJJLL(C13DL.LJIIIZ(objArrCopyOfRange, Arrays.copyOfRange(musicModelArrWR, i + 1, length))));
        return true;
    }

    public final void dS(final String str) {
        TokenCert tokenCertWith;
        String[] strArr;
        String[] strArr2;
        final C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        InterfaceC19515111Wr interfaceC19515111Wr = new InterfaceC19515111Wr() { // from class: X.15Hr
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO[] c0hwoArr) {
                boolean zLIZIZ;
                boolean z = true;
                if (Intrinsics.LJFF(str, "import_sound_from_video_click")) {
                    zLIZIZ = ((IExternalAlbumService) ServiceManager.get().getService(IExternalAlbumService.class)).LIZIZ();
                } else {
                    zLIZIZ = true;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    for (C0HWO c0hwo : c0hwoArr) {
                        if (Intrinsics.LJFF(c0hwo.LIZ, "android.permission.READ_MEDIA_AUDIO") && c0hwo.LIZ()) {
                            break;
                        }
                    }
                    z = false;
                } else {
                    for (C0HWO c0hwo2 : c0hwoArr) {
                        if (Intrinsics.LJFF(c0hwo2.LIZ, "android.permission.WRITE_EXTERNAL_STORAGE") && c0hwo2.LIZ()) {
                            break;
                        }
                    }
                    z = false;
                }
                if (zLIZIZ && z) {
                    String str2 = str;
                    if (Intrinsics.LJFF(str2, "import_sound_from_video_click")) {
                        C19342110ln.LIZ.getClass();
                        C19342110ln.LIZ("upload_video_music_authorization_popup_click", "allow");
                        C19EG c19eg = activity;
                        System.currentTimeMillis();
                        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(c19eg, "extract music", new C15IN(c19eg));
                        return;
                    }
                    if (!Intrinsics.LJFF(str2, "import_sounds_from_device_click")) {
                        return;
                    }
                    C19342110ln.LIZ.getClass();
                    C19342110ln.LIZ("upload_music_authorization_popup_click", "allow");
                    this.gS();
                    return;
                }
                String str3 = str;
                if (Intrinsics.LJFF(str3, "import_sound_from_video_click")) {
                    C19342110ln.LIZ.getClass();
                    C19342110ln.LIZ("upload_video_music_authorization_popup_click", "reject");
                    LocalMusicTabFragment localMusicTabFragment = this;
                    C19EG c19eg2 = activity;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C15IE.LIZ(c2344009Gk);
                    C20684815ws.LJIILLIIL("upload_video_music_authorization_guide_popup_show", c2344009Gk.LIZ);
                    C1397580mTM c1397580mTM = new C1397580mTM(c19eg2);
                    c1397580mTM.LIZ(2131826428);
                    C985403tE.LIZ(c1397580mTM, new AwS610S0100000_31(localMusicTabFragment, 503));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return;
                }
                if (!Intrinsics.LJFF(str3, "import_sounds_from_device_click")) {
                    return;
                }
                C19342110ln.LIZ.getClass();
                C19342110ln.LIZ("upload_music_authorization_popup_click", "reject");
                LocalMusicTabFragment localMusicTabFragment2 = this;
                C19EG c19eg3 = activity;
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                C15IE.LIZ(c2344009Gk2);
                C20684815ws.LJIILLIIL("upload_music_authorization_guide_popup_show", c2344009Gk2.LIZ);
                C1397580mTM c1397580mTM2 = new C1397580mTM(c19eg3);
                c1397580mTM2.LIZ(2131826429);
                C985403tE.LIZ(c1397580mTM2, new AwS610S0100000_31(localMusicTabFragment2, 501));
                new C1397510mTF(c1397580mTM2).LIZLLL();
            }
        };
        if (Intrinsics.LJFF(str, "import_sound_from_video_click")) {
            C19342110ln.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C15IE.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("upload_video_music_authorization_popup_show", c2344009Gk.LIZ);
        } else if (Intrinsics.LJFF(str, "import_sounds_from_device_click")) {
            C19342110ln.LIZ.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C15IE.LIZ(c2344009Gk2);
            C20684815ws.LJIILLIIL("upload_music_authorization_popup_show", c2344009Gk2.LIZ);
        }
        C19514811Wo c19514811Wo = C19514711Wn.LIZIZ;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            tokenCertWith = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab_target33");
        } else {
            tokenCertWith = TokenCert.Companion.with("bpea-tools_request_storage_permission_local_music_tab");
        }
        C19514711Wn c19514711WnLIZIZ = c19514811Wo.LIZIZ(activity, tokenCertWith);
        if (i >= 33) {
            if (Intrinsics.LJFF(str, "import_sound_from_video_click") && (i < 34 || C838410Wul.LIZ(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0)) {
                C323580CmK c323580CmK = new C323580CmK(2);
                if (i >= 34) {
                    strArr2 = new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO"};
                } else {
                    strArr2 = new String[]{"android.permission.READ_MEDIA_VIDEO"};
                }
                c323580CmK.LIZIZ(strArr2);
                c323580CmK.LIZ("android.permission.READ_MEDIA_AUDIO");
                strArr = (String[]) c323580CmK.LIZLLL(new String[c323580CmK.LIZJ()]);
            } else {
                strArr = new String[]{"android.permission.READ_MEDIA_AUDIO"};
            }
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        c19514711WnLIZIZ.LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(interfaceC19515111Wr);
    }

    public final void hS(List<? extends MusicModel> list) {
        String strLJIILL;
        try {
            strLJIILL = this.LLJJJJLIIL.LJIILL(list);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLJIILL = "";
        }
        this.LLJJJJJIL.storeInt("imported_device_sounds_size", list.size());
        this.LLJJJJJIL.storeString("imported_device_sounds", strLJIILL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        RecyclerView recyclerView;
        Integer numValueOf;
        List listLIZIZ;
        MusicModel musicModel;
        Object obj;
        Integer numValueOf2 = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/choosemusic/fragment/LocalMusicTabFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmgbJDd2T/+hJ7f32JIl4WAL/1caA3eAaOo1fuZ6sTTJf73V0xBbXeKTA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z && (LJJLIIIJILLIZJL() instanceof RecyclerView) && (recyclerView = (RecyclerView) LJJLIIIJILLIZJL()) != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                numValueOf = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition());
                numValueOf2 = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition());
            } else {
                numValueOf = null;
            }
            AbstractC683590Qrd abstractC683590QrdLJJLIIIJL = this.LLIZLLLIL.LJJLIIIJL();
            if (abstractC683590QrdLJJLIIIJL != null && (listLIZIZ = C19719512Dh.LIZIZ(abstractC683590QrdLJJLIIIJL.getData())) != null && numValueOf != null && numValueOf2 != null) {
                int iIntValue = numValueOf2.intValue() + 1;
                for (int iIntValue2 = numValueOf.intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                    if (iIntValue2 >= 0 && iIntValue2 < listLIZIZ.size() && (musicModel = ((C20448614zs) ListProtector.get(listLIZIZ, iIntValue2)).LIZIZ) != null && musicModel.isRealMusicItem().booleanValue()) {
                        ((C20494715Hl) abstractC683590QrdLJJLIIIJL).LLLIL(((C20448614zs) ListProtector.get(listLIZIZ, iIntValue2)).LIZIZ, iIntValue2);
                    }
                }
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(LocalMusicTabFragment.class);
        }
    }

    @Override // X.C15GU
    public final /* bridge */ /* synthetic */ void P0(Object obj) {
    }

    public final void ZR(Context context, final C196863120n c196863120n) {
        if (context == null) {
            if (c196863120n != null) {
                c196863120n.onFailed();
                return;
            }
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zVR = VR();
        this.LLJJIJI = zVR;
        if (zVR) {
            this.LLJJJ.clear();
            aS(true);
            int i = this.LLJJJJJIL.getInt("imported_device_sounds_size", Integer.MAX_VALUE);
            if (this.LLJJJJ == null && i > 0) {
                this.LLJJJJ = C1399150mVt.LIZIZ(context, EnumC1399740mWq.VISIBLE_AFTER_5S, new InterfaceC1399770mWt() { // from class: X.120l
                    @Override // X.InterfaceC1399770mWt
                    public final void LIZ() {
                        AnonymousClass0956 anonymousClass0956 = this.LIZ.LLJJJIL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LIZ.iS(new ArrayList(), false);
                        InterfaceC196862120m interfaceC196862120m = c196863120n;
                        if (interfaceC196862120m != null) {
                            interfaceC196862120m.onFailed();
                        }
                        C19342110ln c19342110ln = C19342110ln.LIZ;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c19342110ln.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        c2344009Gk.LIZJ(1, "error_code");
                        c2344009Gk.LIZLLL(jCurrentTimeMillis2, "time");
                        c2344009Gk.LIZLLL(0L, "audio_file_size");
                        c2344009Gk.LIZLLL(0L, "thumb_file_size");
                        C20684815ws.LJIILLIIL("av_performance_local_music_scan", c2344009Gk.LIZ);
                    }
                });
            }
            this.LLJJJIL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C196859120j(this, context, null), 2);
            return;
        }
        this.LLJJJ.clear();
        aS(false);
        if (c196863120n != null) {
            c196863120n.onSuccess(new ArrayList());
        }
    }

    public final void iS(Collection collection, boolean z) {
        if (z) {
            this.LLILZLL.zQ2(0, "local_music_list_status");
            this.LLJJJ.clear();
            this.LLJJJ.addAll(collection);
            aS(true);
            return;
        }
        this.LLILZLL.zQ2(1, "local_music_list_status");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 101 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("extract_music_path");
                if (stringExtra != null) {
                    AIGCInfo aIGCInfo = (AIGCInfo) intent.getParcelableExtra("extract_music_aigc_info");
                    if (stringExtra.length() == 0) {
                        return;
                    }
                    C0VSJ c0vsj = new C0VSJ(stringExtra);
                    if (!c0vsj.exists()) {
                        return;
                    }
                    MusicModel musicModelLIZ = C15KM.LIZ(c0vsj);
                    if (aIGCInfo != null) {
                        musicModelLIZ.setAigcInfo(aIGCInfo);
                    }
                    List<? extends MusicModel> listLJLI = C13LQ.LJLI(WR());
                    ListProtector.add(listLJLI, 0, musicModelLIZ);
                    hS(listLJLI);
                    ListProtector.add(this.LLJJJ, 0, musicModelLIZ);
                    aS(this.LLJJIJI);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void bS(int i, MusicModel musicModel, boolean z, boolean z2) {
        String musicId;
        ChooseMusicSelectView chooseMusicSelectView;
        MusicModel value;
        if (z) {
            if (i >= 0 && i < this.LLJJJ.size()) {
                ListProtector.remove(this.LLJJJ, i);
            }
            if (this.LLJJJ.isEmpty()) {
                C20494715Hl c20494715Hl = (C20494715Hl) NR();
                c20494715Hl.LLJJJ = !c20494715Hl.LLJJJ;
                c20494715Hl.notifyDataSetChanged();
            }
            aS(this.LLJJIJI);
            NR().notifyDataSetChanged();
            C19342110ln c19342110ln = C19342110ln.LIZ;
            String musicId2 = musicModel.getMusicId();
            c19342110ln.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C15IE.LIZ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("fake_music_id", musicId2);
            c2344009Gk.LIZJ(z2 ? 1 : 0, "is_available_music");
            C20684815ws.LJIILLIIL("delete_upload_music", c2344009Gk.LIZ);
        }
        SelectedMusicViewModel selectedMusicViewModel = C20494415Hi.LIZIZ;
        if (selectedMusicViewModel != null) {
            MutableLiveData<MusicModel> mutableLiveDataWQ2 = selectedMusicViewModel.wQ2();
            SelectedMusicViewModel selectedMusicViewModel2 = null;
            if (mutableLiveDataWQ2 != null && (value = mutableLiveDataWQ2.getValue()) != null) {
                musicId = value.getMusicId();
            } else {
                musicId = null;
            }
            if (Intrinsics.LJFF(musicId, musicModel.getMusicId()) && (chooseMusicSelectView = C20494415Hi.LIZ) != null) {
                SelectedMusicViewModel selectedMusicViewModel3 = chooseMusicSelectView.LLJJ;
                if (selectedMusicViewModel3 != null) {
                    selectedMusicViewModel2 = selectedMusicViewModel3;
                }
                selectedMusicViewModel2.yQ2().postValue(Boolean.FALSE);
                C15IC c15ic = chooseMusicSelectView.LLJILLL;
                if (c15ic != null) {
                    c15ic.LIZ(musicModel);
                }
            }
        }
    }
}
