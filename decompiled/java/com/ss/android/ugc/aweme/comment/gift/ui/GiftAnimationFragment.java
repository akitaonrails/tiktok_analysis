package com.ss.android.ugc.aweme.comment.gift.ui;

import X.C098200Yq;
import X.C0VSF;
import X.C0VSJ;
import X.C1470090oMJ;
import X.C1685300txQ;
import X.C189200o6;
import X.C199499133x;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2188811AlT;
import X.C786410Ut5;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import java.io.BufferedReader;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class GiftAnimationFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjHELIOSFiLiY1PGs5IGEUISM4CCE6JSQ4ICA9DjctLiI2JjE=";
    public PlayerController LL;
    public Comment LLILLJJLI;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.release();
        }
        super.onDestroyView();
    }

    public final void MR() {
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        C19EG activity;
        FragmentManager supportFragmentManager2;
        C19EH c19ehLJIIJ;
        C19EG activity2 = getActivity();
        if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null || (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("GiftAnimationFragment")) == null || (activity = getActivity()) == null || (supportFragmentManager2 = activity.getSupportFragmentManager()) == null || (c19ehLJIIJ = supportFragmentManager2.LJIIJ()) == null) {
            return;
        }
        c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.clearFlags(2);
            }
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window4 = dialog.getWindow();
            if (window4 != null) {
                window4.setLayout(-1, -1);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.LLILLJJLI = (Comment) getArguments().getSerializable("comment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String giftEffectPath;
        Long lValueOf;
        String str;
        DataSource.ScaleType scaleTypeConvertFrom;
        String string;
        LifecycleOwner activity;
        String string2 = "";
        super.onViewCreated(view, bundle);
        if (this.LLILLJJLI == null) {
            MR();
        }
        Comment comment = this.LLILLJJLI;
        View viewFindViewById = null;
        if (comment != null) {
            giftEffectPath = comment.getGiftEffectPath();
        } else {
            giftEffectPath = null;
        }
        Comment comment2 = this.LLILLJJLI;
        if (comment2 != null) {
            lValueOf = Long.valueOf(comment2.getFakeGiftId());
        } else {
            lValueOf = null;
        }
        if (C199499133x.LIZ(giftEffectPath) || (lValueOf != null && lValueOf.longValue() == 0)) {
            MR();
        }
        DataSource.ScaleType scaleTypeConvertFrom2 = DataSource.ScaleType.TopFit;
        try {
            BufferedReader bufferedReader = new BufferedReader(new C0VSF(new C0VSJ(giftEffectPath, "config.json")));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
                sb.append("\n");
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString());
            string = JSONObjectProtectorUtils.getString(new JSONObject(jSONObject.get("landscape").toString()), "path");
            try {
                string2 = JSONObjectProtectorUtils.getString(new JSONObject(jSONObject.get("portrait").toString()), "path");
                scaleTypeConvertFrom = DataSource.ScaleType.convertFrom(JSONObjectProtectorUtils.getInt(new JSONObject(jSONObject.get("landscape").toString()), "align"));
                try {
                    scaleTypeConvertFrom2 = DataSource.ScaleType.convertFrom(JSONObjectProtectorUtils.getInt(new JSONObject(jSONObject.get("portrait").toString()), "align"));
                } catch (Exception e) {
                    e = e;
                    str = string2;
                    string2 = string;
                    TryCatchGuardChecker.doCheck(e);
                    string = string2;
                    string2 = str;
                }
            } catch (Exception e2) {
                e = e2;
                str = string2;
                scaleTypeConvertFrom = scaleTypeConvertFrom2;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            scaleTypeConvertFrom = scaleTypeConvertFrom2;
        }
        DataSource dataSource = new DataSource();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(giftEffectPath);
        sbLIZ.append(string);
        DataSource.DataInfo dataInfo = new DataSource.DataInfo(C2188811AlT.LIZIZ(sbLIZ));
        dataInfo.setScaleType(scaleTypeConvertFrom);
        dataSource.setLandscapeDataInfo(dataInfo);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(giftEffectPath);
        sbLIZ2.append(string2);
        DataSource.DataInfo dataInfo2 = new DataSource.DataInfo(C2188811AlT.LIZIZ(sbLIZ2));
        dataInfo2.setScaleType(scaleTypeConvertFrom2);
        dataSource.setPortraitDataInfo(dataInfo2);
        Configuration configuration = new Configuration();
        configuration.setContext(getContext());
        if (IMainSAFLifecycleKt.getEnableFragmentSAFLifecycleRefactor()) {
            activity = this;
        } else {
            activity = getActivity();
        }
        configuration.setLifecycleOwner(activity);
        try {
            if (getView() != null && getView().getContext() != null && (viewFindViewById = view.findViewById(R.id.bli)) == null) {
                MR();
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            MR();
        }
        PlayerController playerController = this.LL;
        if (playerController != null) {
            playerController.detachAlphaView((ViewGroup) viewFindViewById);
            this.LL.release();
        }
        try {
            this.LL = PlayerController.get(configuration, new C1470090oMJ(getContext()));
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            this.LL = PlayerController.get(configuration, new DefaultSystemPlayer());
        }
        this.LL.attachAlphaView((ViewGroup) viewFindViewById);
        this.LL.withVideoAction(new AlphaPlayerAction() { // from class: X.1Acw
            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void onVideoSizeChange(int i, int i2, DataSource.ScaleType scaleType) {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void startAction() {
            }

            @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction
            public final void endAction() {
                this.LIZ.LL.setVisibility(8);
                this.LIZ.MR();
            }
        });
        this.LL.start(dataSource);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setCancelable(false);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a2k, viewGroup, false);
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
}
