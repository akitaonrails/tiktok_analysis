package com.ss.android.ugc.aweme.setting.adapter;

import X.C036E;
import X.C03IT;
import X.C0N1L;
import X.C0XIR;
import X.C10VP;
import X.C1233040iBy;
import X.C1252600ihW;
import X.C1336205Ku;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C197039127h;
import X.C19EG;
import X.C1BVK;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C299940BpI;
import X.C427660Gpo;
import X.C430200Gtu;
import X.C707370Rot;
import X.C786410Ut5;
import X.C844470XAv;
import X.C890330YwJ;
import X.EnumC894560Z7m;
import Y.AObjectS362S0100000_19;
import Y.AObjectS71S0000000_19;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.UserWithBlockSource;
import com.ss.android.ugc.tiktok.tns.userrelation.api.block.IBlockService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes20.dex */
public class BlackHolder extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {
    public Activity mActivity;
    public C427660Gpo mAiHead;
    public C197039127h mBlackBtn;
    public int mBlockSource;
    public WeakHandler mHandler;
    public boolean mIsStory;
    public View mLlRoot;
    public int mThemeMode;
    public TextView mTvName;
    public TextView mTvOpusFans;
    public User mUser;
    public C430200Gtu multiAvatarView;

    private int getBlockResId() {
        if (this.mIsStory) {
            return 2131827612;
        }
        return R.string.eh0;
    }

    private int getUnBlockResId() {
        if (this.mIsStory) {
            return 2131857704;
        }
        return R.string.unBlock;
    }

    private boolean isBlock() {
        if (!this.mIsStory) {
            return this.mUser.isBlock();
        }
        StoryBlockInfo storyBlockInfo = this.mUser.getStoryBlockInfo();
        if (storyBlockInfo == null) {
            return false;
        }
        return storyBlockInfo.isBlock();
    }

    private void setThemeMode() {
        if (this.mThemeMode == 0) {
            return;
        }
        this.mLlRoot.setBackground(null);
        this.mTvName.setTextColor(this.mLlRoot.getResources().getColor(R.color.bp));
        this.mTvOpusFans.setTextColor(this.mLlRoot.getResources().getColor(R.color.df));
    }

    private void showBlockDialog() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        User user = this.mUser;
        if (user != null && user.getAvatarThumb() != null && this.mUser.getAvatarThumb().getUrlList() != null && !this.mUser.getAvatarThumb().getUrlList().isEmpty()) {
            ListProtector.get(this.mUser.getAvatarThumb().getUrlList(), 0);
        }
        if (C299940BpI.LIZ()) {
            IBlockService iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi(IBlockService.class);
            if (iBlockService != null) {
                iBlockService.LIZLLL(this.mActivity, this.mUser.getUniqueId(), "blocked_accounts", new AObjectS362S0100000_19(this, 14));
                return;
            }
            return;
        }
        String nickname = this.mUser.getNickname();
        String uniqueId = this.mUser.getUniqueId();
        Resources resources = this.mActivity.getResources();
        Object[] objArr = new Object[2];
        if (nickname == null) {
            nickname = "";
        }
        objArr[0] = nickname;
        if (uniqueId == null) {
            uniqueId = "";
        }
        objArr[1] = uniqueId;
        String string = resources.getString(2131835952, objArr);
        Activity activity2 = this.mActivity;
        C1397580mTM c1397580mTM = new C1397580mTM(activity2);
        c1397580mTM.LJI(string);
        c1397580mTM.LIZ(2131835946);
        C1397620mTQ c1397620mTQ = new C1397620mTQ(activity2);
        lambda$showBlockDialog$2(c1397620mTQ);
        c1397580mTM.LJIIL = c1397620mTQ;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    private void showUnblockDialog() {
        Activity activity = this.mActivity;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (!C299940BpI.LIZ() || this.mBlockSource != 4) {
            doBlock(true);
            mobBlockConfirmEvent("unblock_confirm", Boolean.FALSE);
            return;
        }
        IBlockService iBlockService = (IBlockService) PluggableExtentionKt.pluggableSpi(IBlockService.class);
        if (iBlockService == null) {
            return;
        }
        iBlockService.LIZ(this.mActivity, this.mUser.getUniqueId(), new AObjectS71S0000000_19(5), new AObjectS362S0100000_19(this, 15));
    }

    private void updateBlockStatus() {
        UrlModel avatarThumb = this.mUser.getAvatarThumb();
        if (avatarThumb != null) {
            C03IT c03it = new C03IT(avatarThumb.getUrlList());
            if (this.mBlockSource != 4) {
                C786410Ut5.LLLLLJLJLL(this.multiAvatarView, 8);
                C786410Ut5.LLLLLJIL(this.mAiHead, 0);
                this.mAiHead.LJIIJ(c03it);
                TextView textView = this.mTvOpusFans;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.g);
                sbLIZ.append(TextUtils.isEmpty(this.mUser.getUniqueId()) ? this.mUser.getShortId() : this.mUser.getUniqueId());
                textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C786410Ut5.LLLLLJLJLL(this.multiAvatarView, 0);
            C786410Ut5.LLLLLJIL(this.mAiHead, 8);
            C430200Gtu c430200Gtu = this.multiAvatarView;
            c430200Gtu.getClass();
            C430200Gtu.LIZ(c430200Gtu, c03it);
            C430200Gtu c430200Gtu2 = this.multiAvatarView;
            Integer numValueOf = Integer.valueOf(R.drawable.d6j);
            c430200Gtu2.getClass();
            C430200Gtu.LIZIZ(c430200Gtu2, numValueOf);
            this.mTvOpusFans.setText(2131837580);
        }
    }

    public static boolean INVOKESTATIC_com_ss_android_ugc_aweme_setting_adapter_BlackHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private void displayBlockStatus(boolean z) {
        if (z) {
            this.mBlackBtn.setText(getUnBlockResId());
            this.mBlackBtn.setButtonVariant(1);
        } else {
            this.mBlackBtn.setText(getBlockResId());
            this.mBlackBtn.setButtonVariant(0);
        }
        updateBlockStatus();
    }

    private void doBlock(boolean z) {
        int i;
        WeakHandler weakHandler = this.mHandler;
        final String uid = this.mUser.getUid();
        final String secUid = this.mUser.getSecUid();
        final int i2 = !z ? 1 : 0;
        final int i3 = this.mBlockSource;
        BlockApi.BlockService blockService = BlockApi.LIZ;
        C1BVK c1bvkLIZIZ = C1BVK.LIZIZ();
        Callable<?> callable = new Callable() { // from class: X.08mG
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str = uid;
                String str2 = secUid;
                int i4 = i2;
                int i5 = i3;
                C1C7U.LIZ("BlockApi@a9bc.blockUser$1L");
                try {
                    BlockStruct blockStruct = BlockApi.LIZ.block(str, str2, i4, i5).execute().LIZIZ;
                    C1C7U.LIZIZ("BlockApi@a9bc.blockUser$1L");
                    return blockStruct;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1C7U.LIZIZ("BlockApi@a9bc.blockUser$1L");
                    return null;
                }
            }
        };
        if (i3 == 1) {
            i = 32;
        } else {
            i = 31;
        }
        c1bvkLIZIZ.LIZ(weakHandler, callable, i);
        if (z) {
            C1252600ihW c1252600ihW = new Object() { // from class: X.0ihW
            };
            String uid2 = this.mUser.getUid();
            c1252600ihW.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "blocked_accounts");
            c2344009Gk.LJIIIIZZ("to_use_id", uid2);
            C20684815ws.LJIILLIIL("unblock_account", c2344009Gk.LIZ);
            C0N1L.LIZIZ("black_list", this.mUser.getUid());
            return;
        }
        C1252600ihW c1252600ihW2 = new Object() { // from class: X.0ihW
        };
        String uid3 = this.mUser.getUid();
        c1252600ihW2.getClass();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", "blocked_accounts");
        c2344009Gk2.LJIIIIZZ("to_use_id", uid3);
        C20684815ws.LJIILLIIL("unblock_account", c2344009Gk2.LIZ);
        C0N1L.LIZ("black_list", this.mUser.getUid(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showBlockDialog$0(Boolean bool) {
        int i;
        if (bool.booleanValue()) {
            i = 4;
        } else {
            i = 0;
        }
        this.mBlockSource = i;
        doBlock(false);
        mobBlockConfirmEvent("block_confirm", bool);
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showBlockDialog$1(C1397660mTU c1397660mTU) {
        doBlock(false);
        mobBlockConfirmEvent("block_confirm", Boolean.FALSE);
        return Unit.LIZ;
    }

    private Unit lambda$showBlockDialog$2(C1397620mTQ c1397620mTQ) {
        c1397620mTQ.LIZJ(0, this.mActivity.getResources().getString(R.string.eh0), new AObjectS362S0100000_19(this, 16));
        c1397620mTQ.LIZJ(1, this.mActivity.getResources().getString(R.string.f1_), null);
        return Unit.LIZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showUnblockDialog$3(Boolean bool) {
        doBlock(true);
        mobBlockConfirmEvent("unblock_confirm", bool);
        return Unit.LIZ;
    }

    private void mobBlockEvent(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "block_list");
        c2344009Gk.LJIIIIZZ("to_user_id", this.mUser.getUid());
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public void bind(UserWithBlockSource userWithBlockSource) {
        int i;
        if (userWithBlockSource.blockingByType == 1) {
            i = 4;
        } else {
            i = 0;
        }
        bind(userWithBlockSource, i);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i;
        int i2;
        int i3;
        if (this.mActivity.isFinishing()) {
            return;
        }
        int i4 = message.what;
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (i4 == 31 || i4 == 32) {
            if (messageObj instanceof ExecutionException) {
                messageObj = ((Throwable) messageObj).getCause();
            }
            if (messageObj instanceof C0XIR) {
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy.LIZJ(((C0XIR) messageObj).getErrorMsg());
                c1233040iBy.LIZLLL();
                return;
            }
            if (messageObj instanceof Exception) {
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy2 = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy2.LIZIZ(R.string.m25);
                c1233040iBy2.LIZLLL();
                return;
            }
            if (!(messageObj instanceof BlockStruct)) {
                return;
            }
            boolean z = true;
            if (((BlockStruct) messageObj).blockStatus != 1) {
                z = false;
            }
            if (i4 == 32) {
                StoryBlockInfo storyBlockInfo = this.mUser.getStoryBlockInfo();
                if (storyBlockInfo == null) {
                    storyBlockInfo = new StoryBlockInfo();
                    this.mUser.setStoryBlockInfo(storyBlockInfo);
                }
                storyBlockInfo.setBlock(z);
                displayBlockStatus(storyBlockInfo.isBlock());
                Resources resources = this.mActivity.getResources();
                if (z) {
                    i3 = 2131827613;
                } else {
                    i3 = 2131857705;
                }
                String string = resources.getString(i3);
                C844470XAv.LIZ.getClass();
                C1233040iBy c1233040iBy3 = new C1233040iBy(C844470XAv.LIZ());
                c1233040iBy3.LIZJ(string);
                c1233040iBy3.LIZLLL();
            } else {
                this.mUser.setBlock(z);
                Activity activity = this.mActivity;
                this.mUser.getUniqueId();
                int i5 = this.mBlockSource;
                if (activity != null) {
                    if (C299940BpI.LIZ()) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        if (z) {
                            if (i5 == 4) {
                                i2 = 2131837582;
                            } else {
                                i2 = 2131837581;
                            }
                        } else if (i5 == 4) {
                            i2 = 2131837592;
                        } else {
                            i2 = 2131837591;
                        }
                        c1389890mGx.LJIIIZ(i2);
                        c1389890mGx.LJIIJJI();
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                        Resources resources2 = activity.getResources();
                        if (z) {
                            i = 2131826446;
                        } else {
                            i = R.string.unBlock;
                        }
                        c1389890mGx2.LJIIJ(resources2.getString(i));
                        c1389890mGx2.LJIIJJI();
                    }
                }
                displayBlockStatus(this.mUser.isBlock());
                if (this.mUser.isBlock()) {
                    try {
                        C19EG c19eg = (C19EG) this.mActivity;
                        IMChatListApi.LJJIII.getClass();
                        C890330YwJ.LIZ().LJJIJL(c19eg.getSupportFragmentManager(), EnumC894560Z7m.BLOCK);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            C707370Rot.LIZ.LIZ("aweme.main.profile.more_page_user_info_change").postValue(this.mUser);
            C1336205Ku.LIZ(false).getImUserService().LJIILIIL(IMUser.fromUser(this.mUser));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C844470XAv.LIZ.getClass();
        if (!INVOKESTATIC_com_ss_android_ugc_aweme_setting_adapter_BlackHolder_com_ss_android_ugc_aweme_net_lancet_NetworkLancet_isNetworkAvailableTwo(C844470XAv.LIZ())) {
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131837962);
            c1233040iBy.LIZLLL();
            return;
        }
        int id = view.getId();
        if (id == R.id.c2n) {
            if (!isBlock()) {
                mobBlockEvent("block");
                showBlockDialog();
                return;
            } else {
                mobBlockEvent("unblock");
                showUnblockDialog();
                return;
            }
        }
        if (id != R.id.c2r) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.mActivity, "aweme://user/profile/");
        smartRouteBuildRoute.withParam("uid", this.mUser.getUid());
        smartRouteBuildRoute.withParam("sec_user_id", this.mUser.getSecUid());
        smartRouteBuildRoute.open();
    }

    public BlackHolder(View view, Activity activity) {
        super(view);
        this.mActivity = activity;
        this.mAiHead = (C427660Gpo) view.findViewById(R.id.c2o);
        this.multiAvatarView = (C430200Gtu) view.findViewById(R.id.c3h);
        this.mTvName = (TextView) view.findViewById(R.id.c2p);
        this.mTvOpusFans = (TextView) view.findViewById(R.id.c2q);
        this.mLlRoot = view.findViewById(R.id.c2r);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.c2n);
        this.mBlackBtn = c197039127h;
        C10VP.LIZIZ(c197039127h);
        this.mHandler = new WeakHandler(this);
        this.mBlackBtn.setTextSize(12.0f);
        C786410Ut5.U8(this.mBlackBtn, this);
    }

    private void mobBlockConfirmEvent(String str, Boolean bool) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "block_list");
        c2344009Gk.LJIIIIZZ("to_user_id", this.mUser.getUid());
        Map<String, String> map = c2344009Gk.LIZ;
        if (C299940BpI.LIZ()) {
            if (bool.booleanValue()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            ((HashMap) map).put("remove_linked_account_toggle", str2);
        }
        C20684815ws.LJIILLIIL(str, map);
    }

    public void bind(UserWithBlockSource userWithBlockSource, int i) {
        bind(userWithBlockSource, i, 0);
    }

    public void bind(UserWithBlockSource userWithBlockSource, int i, int i2) {
        if (userWithBlockSource == null) {
            return;
        }
        this.mThemeMode = i2;
        setThemeMode();
        boolean z = false;
        if (i == -1) {
            i = 0;
        }
        this.mBlockSource = i;
        if (i == 1) {
            z = true;
        }
        this.mIsStory = z;
        User user = userWithBlockSource.user;
        this.mUser = user;
        StoryBlockInfo storyBlockInfo = user.getStoryBlockInfo();
        if (this.mIsStory) {
            if (storyBlockInfo == null) {
                StoryBlockInfo storyBlockInfo2 = new StoryBlockInfo();
                storyBlockInfo2.setBlock(true);
                this.mUser.setStoryBlockInfo(storyBlockInfo2);
            }
            displayBlockStatus(true);
        } else {
            displayBlockStatus(this.mUser.isBlock);
        }
        this.mTvName.setText(this.mUser.getNickname());
    }
}
