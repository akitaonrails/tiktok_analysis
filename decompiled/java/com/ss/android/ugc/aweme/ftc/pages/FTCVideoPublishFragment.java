package com.ss.android.ugc.aweme.ftc.pages;

import X.C098200Yq;
import X.C0CHQ;
import X.C0I7D;
import X.C0M5N;
import X.C0M5R;
import X.C0MPH;
import X.C1428470nHB;
import X.C1430420nKK;
import X.C1446630nkT;
import X.C15O7;
import X.C1633850scR;
import X.C1685300txQ;
import X.C1741940vQm;
import X.C189200o6;
import X.C19881612qc;
import X.C19EG;
import X.C19GS;
import X.C1DFK;
import X.C201955140j;
import X.C2108108Nr;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C2354709Kn;
import X.C2500409r0;
import X.C443110HZd;
import X.C468501s3;
import X.C574800MgY;
import X.C581030Mqb;
import X.C581190Mqr;
import X.C581270Mqz;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1237630iJN;
import X.InterfaceC1286300jZs;
import X.InterfaceC1635410sex;
import Y.ACallableS67S1200000_3;
import Y.ATListenerS442S0100000_8;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import irm.AkS95S0100000_29;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import lth.o;

/* JADX INFO: loaded from: classes9.dex */
public final class FTCVideoPublishFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiM4KmEjHELIOSKSIpOmEVHAYaICs2JxU5KyM6Oy0KOy40JSAiPQ==";
    public C0I7D LL;
    public FrameLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public ImageView LLILZ;
    public VideoPublishEditModel LLILZIL;
    public C0MPH LLILZLL;
    public Bitmap LLJ;
    public DialogC1237630iJN LLJILJIL;
    public final AtomicInteger LLIZ = new AtomicInteger(0);
    public final int LLIZLLLIL = 150;
    public final C581030Mqb LLJI = new C581030Mqb(this, 0);
    public final ATListenerS442S0100000_8 LLJIJIL = new ATListenerS442S0100000_8(this, 0);

    public final void LJIIL() {
        DialogC1237630iJN dialogC1237630iJN;
        DialogC1237630iJN dialogC1237630iJN2 = this.LLJILJIL;
        if (dialogC1237630iJN2 == null || !dialogC1237630iJN2.isShowing() || (dialogC1237630iJN = this.LLJILJIL) == null) {
            return;
        }
        dialogC1237630iJN.dismiss();
        C785410UrT.LIZ(dialogC1237630iJN);
    }

    public final C0I7D MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hcs) : null;
            this.LL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final ImageView NR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.l61) : null;
            this.LLILZ = (ImageView) viewFindViewById;
        }
        return (ImageView) viewFindViewById;
    }

    public final void PR() {
        boolean zLJFF;
        VideoPublishEditModel videoPublishEditModel = this.LLILZIL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLILZIL;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel2.getMvCreateVideoData();
            String str = mvCreateVideoData != null ? mvCreateVideoData.videoCoverImgPath : null;
            if (C2354709Kn.LIZIZ(str)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ), null, null, new C468501s3(this, str, null), 3);
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLILZIL;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        if (videoPublishEditModel3.isMultiVideoEdit()) {
            VideoPublishEditModel videoPublishEditModel4 = this.LLILZIL;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            VERecordData vERecordDataLIZJ = C574800MgY.LIZJ(videoPublishEditModel4.getCurMultiEditVideoRecordData());
            VideoPublishEditModel videoPublishEditModel5 = this.LLILZIL;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            Pair<Integer, Integer> playInOutTime = videoPublishEditModel5.getCurMultiEditVideoRecordData().getPlayInOutTime();
            vERecordDataLIZJ.setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
            VideoPublishEditModel videoPublishEditModel6 = this.LLILZIL;
            if (videoPublishEditModel6 == null) {
                videoPublishEditModel6 = null;
            }
            int videoCoverStartTm = (int) (videoPublishEditModel6.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
            VideoPublishEditModel videoPublishEditModel7 = this.LLILZIL;
            if (videoPublishEditModel7 == null) {
                videoPublishEditModel7 = null;
            }
            int iIntValue = videoPublishEditModel7.isUseTimeReverseEffect() ? (((Number) playInOutTime.second).intValue() - ((Number) playInOutTime.first).intValue()) - videoCoverStartTm : videoCoverStartTm;
            VideoPublishEditModel videoPublishEditModel8 = this.LLILZIL;
            if (videoPublishEditModel8 == null) {
                videoPublishEditModel8 = null;
            }
            int iVideoWidth = videoPublishEditModel8.videoWidth();
            VideoPublishEditModel videoPublishEditModel9 = this.LLILZIL;
            VEUtils.getVideoThumb(vERecordDataLIZJ, iIntValue, iVideoWidth, (videoPublishEditModel9 != null ? videoPublishEditModel9 : null).videoHeight(), false, new InterfaceC1286300jZs() { // from class: X.0MBX
                @Override // X.InterfaceC1286300jZs
                public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                    String str2;
                    String str3;
                    EffectTextModel effectTextModel;
                    Bitmap bitmapMergeCoverText;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    VideoPublishEditModel videoPublishEditModel10 = this.LIZ.LLILZIL;
                    if (videoPublishEditModel10 == null) {
                        videoPublishEditModel10 = null;
                    }
                    CoverPublishModel coverPublishModel = videoPublishEditModel10.getCoverPublishModel();
                    if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapCreateBitmap)) != null) {
                        bitmapCreateBitmap = bitmapMergeCoverText;
                    }
                    C443530HaJ c443530HaJ = new C443530HaJ(this.LIZ.getResources(), bitmapCreateBitmap);
                    c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, this.LIZ.getContext()));
                    this.LIZ.NR().setImageDrawable(c443530HaJ);
                    VideoPublishEditModel videoPublishEditModel11 = this.LIZ.LLILZIL;
                    if (videoPublishEditModel11 == null) {
                        videoPublishEditModel11 = null;
                    }
                    MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel11.getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData != null) {
                        str2 = multiEditVideoRecordData.coverImagePath;
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        VideoPublishEditModel videoPublishEditModel12 = this.LIZ.LLILZIL;
                        if (videoPublishEditModel12 == null) {
                            videoPublishEditModel12 = null;
                        }
                        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel12.getMultiEditVideoRecordData();
                        if (multiEditVideoRecordData2 != null) {
                            VideoPublishEditModel videoPublishEditModel13 = this.LIZ.LLILZIL;
                            if (videoPublishEditModel13 == null) {
                                videoPublishEditModel13 = null;
                            }
                            multiEditVideoRecordData2.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel13.getCreativeInfo());
                        }
                    }
                    VideoPublishEditModel videoPublishEditModel14 = this.LIZ.LLILZIL;
                    if (videoPublishEditModel14 == null) {
                        videoPublishEditModel14 = null;
                    }
                    MultiEditVideoStatusRecordData multiEditVideoRecordData3 = videoPublishEditModel14.getMultiEditVideoRecordData();
                    if (multiEditVideoRecordData3 == null || (str3 = multiEditVideoRecordData3.coverImagePath) == null) {
                        str3 = "";
                    }
                    C383300F1c.LJ(bitmapCreateBitmap, str3, 100, null);
                    return false;
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel10 = this.LLILZIL;
        if (videoPublishEditModel10 == null) {
            videoPublishEditModel10 = null;
        }
        if (videoPublishEditModel10.getEffectList() != null) {
            VideoPublishEditModel videoPublishEditModel11 = this.LLILZIL;
            if (videoPublishEditModel11 == null) {
                videoPublishEditModel11 = null;
            }
            arrayList.addAll(videoPublishEditModel11.getEffectList());
        }
        VideoPublishEditModel videoPublishEditModel12 = this.LLILZIL;
        if (videoPublishEditModel12 == null) {
            videoPublishEditModel12 = null;
        }
        EffectPointModel timeEffect = videoPublishEditModel12.getTimeEffect();
        if (timeEffect != null) {
            arrayList.add(timeEffect);
            zLJFF = Intrinsics.LJFF(timeEffect.getKey(), "1");
        } else {
            zLJFF = false;
        }
        VideoPublishEditModel videoPublishEditModel13 = this.LLILZIL;
        if (videoPublishEditModel13 == null) {
            videoPublishEditModel13 = null;
        }
        C1428470nHB.LJ(videoPublishEditModel13, C0CHQ.LIZ().LJJIL().LIZIZ()).getFilterFolder();
        VideoPublishEditModel videoPublishEditModel14 = this.LLILZIL;
        if (videoPublishEditModel14 == null) {
            videoPublishEditModel14 = null;
        }
        videoPublishEditModel14.getSelectedFilterIntensity();
        VideoPublishEditModel videoPublishEditModel15 = this.LLILZIL;
        if (videoPublishEditModel15 == null) {
            videoPublishEditModel15 = null;
        }
        int videoCoverStartTm2 = (int) (videoPublishEditModel15.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
        VideoPublishEditModel videoPublishEditModel16 = this.LLILZIL;
        if (videoPublishEditModel16 == null) {
            videoPublishEditModel16 = null;
        }
        EditPreviewInfo previewInfo = videoPublishEditModel16.getPreviewInfo();
        VideoPublishEditModel videoPublishEditModel17 = this.LLILZIL;
        C1446630nkT.LIZIZ(videoCoverStartTm2, zLJFF, previewInfo, (videoPublishEditModel17 != null ? videoPublishEditModel17 : null).getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.0MBY
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                C1233040iBy c1233040iBy = new C1233040iBy(o.LIZ);
                c1233040iBy.LIZIZ(2131839098);
                c1233040iBy.LIZLLL();
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                EffectTextModel effectTextModel;
                Bitmap bitmapMergeCoverText;
                if (this.LIZ.NR() != null && this.LIZ.getContext() != null) {
                    VideoPublishEditModel videoPublishEditModel18 = this.LIZ.LLILZIL;
                    if (videoPublishEditModel18 == null) {
                        videoPublishEditModel18 = null;
                    }
                    CoverPublishModel coverPublishModel = videoPublishEditModel18.getCoverPublishModel();
                    if (coverPublishModel != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmap)) != null) {
                        bitmap = bitmapMergeCoverText;
                    }
                    C443530HaJ c443530HaJ = new C443530HaJ(this.LIZ.getResources(), bitmap);
                    c443530HaJ.LIZJ(C12ES.LIZJ(4.0f, o.LIZ));
                    this.LIZ.NR().setImageDrawable(c443530HaJ);
                    FTCVideoPublishFragment fTCVideoPublishFragment = this.LIZ;
                    fTCVideoPublishFragment.LLJ = bitmap;
                    VideoPublishEditModel videoPublishEditModel19 = fTCVideoPublishFragment.LLILZIL;
                    if (videoPublishEditModel19 == null) {
                        videoPublishEditModel19 = null;
                    }
                    C15O7.LIZIZ(new ACallableS67S1200000_3(bitmap, videoPublishEditModel19.getVideoCoverPath(), 1), C1446630nkT.LIZ, null);
                }
            }
        });
    }

    public FTCVideoPublishFragment() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        C2296808zG.LIZ(C2108108Nr.LIZ.plus(c1dfkLIZ).plus(new C581270Mqz(CoroutineExceptionHandler.LJJLIL, this, 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        OR(null, getView());
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    public static void OR(ATListenerS442S0100000_8 aTListenerS442S0100000_8, View view) {
        if (!(view instanceof EditText)) {
            view.setOnTouchListener(aTListenerS442S0100000_8);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                OR(aTListenerS442S0100000_8, viewGroup.getChildAt(i));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        VideoPublishEditModel videoPublishEditModel2;
        super.onViewCreated(view, bundle);
        requireActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
        requireActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        OR(this.LLJIJIL, view);
        Bundle arguments = getArguments();
        if (arguments != null && (videoPublishEditModel = (VideoPublishEditModel) arguments.getSerializable("args")) != null) {
            this.LLILZIL = videoPublishEditModel;
            if (!videoPublishEditModel.isPreviewInfoValid()) {
                C19EG activity = getActivity();
                if (activity != null) {
                    C0M5N c0m5n = C0M5N.LIZ;
                    C0M5R c0m5r = new C0M5R(activity, null);
                    c0m5n.getClass();
                    C0M5N.LIZ(c0m5r);
                }
                C201955140j.LJ("VideoPublishPage finish because of null EditPreviewInfo");
                return;
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LLILZIL;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z = arguments2.getBoolean("fromDraft", false);
            } else {
                z = false;
            }
            videoPublishEditModel3.mIsFromDraft = z;
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.getInt("extra_stick_point_type", 0);
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                arguments4.getBoolean("enter_record_from_other_platform", false);
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                arguments5.getBoolean("edit_publish_session_end_together", false);
            }
            VideoPublishEditModel videoPublishEditModel4 = this.LLILZIL;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            String title = videoPublishEditModel4.getTitle();
            if (title != null && title.length() != 0) {
                MR().setText(title);
            }
            MR().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0Mos
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) throws Throwable {
                    String string;
                    String string2;
                    if (z2) {
                        C0LAB c0lab = new C0LAB();
                        VideoPublishEditModel videoPublishEditModel5 = this.LL.LLILZIL;
                        VideoPublishEditModel videoPublishEditModel6 = null;
                        if (videoPublishEditModel5 == null) {
                            videoPublishEditModel5 = null;
                        }
                        c0lab.LJ("creation_id", videoPublishEditModel5.getCreationId());
                        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LL.MR(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOy8YNHe3TXgfoJFPsYx7/uf49AbXj94wjvcWM+ig44Omg==", null));
                        if (editableLLLLJI != null && (string2 = editableLLLLJI.toString()) != null) {
                            string = a0.LJLIIIL(string2).toString();
                        } else {
                            string = null;
                        }
                        c0lab.LJ("desc_detail", string);
                        VideoPublishEditModel videoPublishEditModel7 = this.LL.LLILZIL;
                        if (videoPublishEditModel7 == null) {
                            videoPublishEditModel7 = null;
                        }
                        if (videoPublishEditModel7.getDraftId() != 0) {
                            VideoPublishEditModel videoPublishEditModel8 = this.LL.LLILZIL;
                            if (videoPublishEditModel8 != null) {
                                videoPublishEditModel6 = videoPublishEditModel8;
                            }
                            c0lab.LIZ(videoPublishEditModel6.getDraftId(), "draft_id");
                        }
                        C20684815ws.LJIILLIIL("describe_video", c0lab.LIZ);
                    }
                }
            });
            C0I7D c0i7dMR = MR();
            final int i = this.LLIZLLLIL;
            c0i7dMR.setFilters(new C443110HZd[]{new InputFilter(i) { // from class: X.0HZd
                public final int LL;

                {
                    this.LL = i;
                }

                @Override // android.text.InputFilter
                public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                    int length = this.LL - (spanned.length() - (i5 - i4));
                    if (length <= 0) {
                        if (!TextUtils.isEmpty(charSequence)) {
                            String string = C0CHQ.LIZ.getResources().getString(2131847374, Integer.valueOf(this.LL));
                            C1233040iBy c1233040iBy = new C1233040iBy(C0CHQ.LIZ);
                            c1233040iBy.LIZJ(string);
                            c1233040iBy.LIZLLL();
                        }
                        return "";
                    }
                    if (length >= i3 - i2) {
                        return null;
                    }
                    int i6 = length + i2;
                    String string2 = C0CHQ.LIZ.getResources().getString(2131847374, Integer.valueOf(this.LL));
                    int i7 = i6 - 1;
                    if (Character.isHighSurrogate(charSequence.charAt(i7))) {
                        if (i7 == i2) {
                            C1233040iBy c1233040iBy2 = new C1233040iBy(C0CHQ.LIZ);
                            c1233040iBy2.LIZJ(string2);
                            c1233040iBy2.LIZLLL();
                            return "";
                        }
                        i6 = i7;
                    }
                    C1233040iBy c1233040iBy3 = new C1233040iBy(C0CHQ.LIZ);
                    c1233040iBy3.LIZJ(string2);
                    c1233040iBy3.LIZLLL();
                    return charSequence.subSequence(i2, i6);
                }
            }});
            MR().removeTextChangedListener(this.LLJI);
            MR().addTextChangedListener(this.LLJI);
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.z2w);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById;
            }
            C786410Ut5.h9((TuxTextView) viewFindViewById, new AkS80S0100000_8(this, 3));
            NR().setScaleType(ImageView.ScaleType.CENTER_CROP);
            VideoPublishEditModel videoPublishEditModel5 = this.LLILZIL;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel2 = null;
            } else {
                videoPublishEditModel2 = videoPublishEditModel5;
            }
            if (videoPublishEditModel2.mIsFromDraft) {
                if (videoPublishEditModel5 == null) {
                    videoPublishEditModel5 = null;
                }
                if (videoPublishEditModel5.getVideoCoverPath() != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.LLILZIL;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    C2354709Kn.LJIJJLI(videoPublishEditModel6.getVideoCoverPath());
                    VideoPublishEditModel videoPublishEditModel7 = this.LLILZIL;
                    if (videoPublishEditModel7 == null) {
                        videoPublishEditModel7 = null;
                    }
                    videoPublishEditModel7.generateVideoCoverPath();
                }
            }
            PR();
            C786410Ut5.Q7(NR(), new AkS95S0100000_29(this, 10));
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.cmf);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.O7((FrameLayout) viewFindViewById2, new AkS80S0100000_8(this, 35));
            VideoPublishEditModel videoPublishEditModel8 = this.LLILZIL;
            if (videoPublishEditModel8 == null) {
                videoPublishEditModel8 = null;
            }
            if (videoPublishEditModel8.mIsFromDraft) {
                v7.o oVar = new v7.o();
                C19EG activity2 = getActivity();
                if (activity2 != null) {
                    this.LLIZ.incrementAndGet();
                    if (this.LLILZLL == null && !activity2.isFinishing()) {
                        this.LLILZLL = C0MPH.LIZLLL(activity2, getString(2131846487));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("FTCVideoPublish prepareEffectPlatformImpl:");
                        sbLIZ.append(this.LLILZLL);
                        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C0CHQ.LIZ().LJJIZ();
                VideoPublishEditModel videoPublishEditModel9 = this.LLILZIL;
                if (videoPublishEditModel9 == null) {
                    videoPublishEditModel9 = null;
                }
                ArrayList<EffectPointModel> effectList = videoPublishEditModel9.getEffectList();
                if (effectList != null && !effectList.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    VideoPublishEditModel videoPublishEditModel10 = this.LLILZIL;
                    if (videoPublishEditModel10 == null) {
                        videoPublishEditModel10 = null;
                    }
                    for (EffectPointModel effectPointModel : videoPublishEditModel10.getEffectList()) {
                        if (!C2354709Kn.LIZIZ(effectPointModel.getResDir())) {
                            hashSet.add(effectPointModel.getKey());
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        InterfaceC1635410sex interfaceC1635410sexLIZ = C1633850scR.LIZ(requireActivity(), null);
                        interfaceC1635410sexLIZ.kg(this);
                        interfaceC1635410sexLIZ.LJFF(new ArrayList(hashSet), true, null, new C2500409r0(oVar, 1));
                    } else {
                        C201955140j.LJIIL("All effects needn't download");
                        oVar.LJ(null);
                    }
                } else {
                    C201955140j.LJIIL("ignore fetch specialfilter because of empty effects");
                    oVar.LJ(null);
                }
                C15O7 c15o7LJIIJ = C15O7.LJIIJ(null);
                v7.o oVar2 = new v7.o();
                oVar2.LJ(null);
                C15O7.LJJ(C19881612qc.LIZIZ(c15o7LJIIJ, oVar.LIZ, oVar2.LIZ)).LJ(new C581190Mqr(this, 2), C15O7.LJIIIIZZ, null);
            }
            C1741940vQm.LIZ(getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        VideoPublishEditModel videoPublishEditModelLIZJ;
        super.onActivityResult(i, i2, intent);
        if (i == 4 && i2 == -1 && intent != null && (videoPublishEditModelLIZJ = C1430420nKK.LIZJ(intent)) != null) {
            this.LLILZIL = videoPublishEditModelLIZJ;
            PR();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c8n, viewGroup, false);
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
