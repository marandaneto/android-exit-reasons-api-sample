# Android Process Exit Reasons API Sample

It's just a sample with a Single Activity that fetches the last process exit's reason using the new Android R API [ApplicationExitInfo](https://developer.android.com/reference/kotlin/android/app/ApplicationExitInfo) and prints it on the screen.

The textView has an `OnClickListener` that you can switch ways of crashing the App.

- RuntimeException (UncaughtExceptionHandler)
- System.exit
- ANR
- NDK segfault

Restart the App. and look at the reason :)

[Android 11: Developer Preview 3](https://android-developers.googleblog.com/2020/04/android-11-developer-preview-3.html)

Payload example:

```text

----- pid 15987 at 2022-10-03 16:52:23.938520831+0200 -----
Cmd line: com.x.androidrsample
Build fingerprint: 'google/flame/flame:12/SQ3A.220705.003.A1/8672226:user/release-keys'
ABI: 'arm64'
Build type: optimized
Zygote loaded classes=19612 post zygote classes=908
Dumping registered class loaders
#0 dalvik.system.PathClassLoader: [], parent #1
#1 java.lang.BootClassLoader: [], no parent
#2 dalvik.system.PathClassLoader: [/data/data/com.x.androidrsample/code_cache/.overlay/base.apk/classes.dex], parent #1
Done dumping class loaders
Classes initialized: 0 in 0
Intern table: 30304 strong; 1190 weak
JNI: CheckJNI is on; globals=375 (plus 63 weak)
Libraries: /data/app/~~pxicndAGOY1VvHTX6g3FdQ==/com.x.androidrsample-z91d5sDs079wysfLFkj5Kg==/lib/arm64/libnative-sample.so libandroid.so libaudioeffect_jni.so libcompiler_rt.so libframework-connectivity-jni.so libicu_jni.so libjavacore.so libjavacrypto.so libjnigraphics.so libmedia_jni.so libopenjdk.so librs_jni.so librtp_jni.so libsoundpool.so libstats_jni.so libwebviewchromium_loader.so (16)
Heap: 79% free, 5770KB/27MB; 259191 objects
Dumping cumulative Gc timings
Start Dumping Averages for 2 iterations for concurrent copying
ClearFromSpace:	Sum: 16.428ms Avg: 8.214ms
ScanImmuneSpaces:	Sum: 13.694ms Avg: 6.847ms
VisitConcurrentRoots:	Sum: 10.235ms Avg: 5.117ms
MarkingPhase:	Sum: 6.832ms Avg: 3.416ms
ScanCardsForSpace:	Sum: 3.740ms Avg: 1.870ms
ProcessMarkStack:	Sum: 854us Avg: 427us
SweepSystemWeaks:	Sum: 691us Avg: 345.500us
CaptureThreadRootsForMarking:	Sum: 632us Avg: 316us
InitializePhase:	Sum: 536us Avg: 268us
GrayAllDirtyImmuneObjects:	Sum: 516us Avg: 258us
FlipOtherThreads:	Sum: 123us Avg: 61.500us
VisitNonThreadRoots:	Sum: 114us Avg: 57us
RecordFree:	Sum: 72us Avg: 36us
ProcessReferences:	Sum: 62us Avg: 31us
MarkZygoteLargeObjects:	Sum: 56us Avg: 28us
ForwardSoftReferences:	Sum: 51us Avg: 25.500us
EmptyRBMarkBitStack:	Sum: 50us Avg: 25us
SwapBitmaps:	Sum: 39us Avg: 19.500us
(Paused)GrayAllNewlyDirtyImmuneObjects:	Sum: 37us Avg: 18.500us
EnqueueFinalizerReferences:	Sum: 34us Avg: 17us
SweepLargeObjects:	Sum: 34us Avg: 17us
ResumeRunnableThreads:	Sum: 33us Avg: 16.500us
CopyingPhase:	Sum: 29us Avg: 14.500us
ThreadListFlip:	Sum: 26us Avg: 13us
(Paused)ClearCards:	Sum: 19us Avg: 9.500us
SweepAllocSpace:	Sum: 17us Avg: 8.500us
FlipThreadRoots:	Sum: 16us Avg: 8us
MarkStackAsLive:	Sum: 12us Avg: 6us
(Paused)SetFromSpace:	Sum: 12us Avg: 6us
ReclaimPhase:	Sum: 9us Avg: 4.500us
UnBindBitmaps:	Sum: 5us Avg: 2.500us
(Paused)FlipCallback:	Sum: 4us Avg: 2us
Sweep:	Sum: 3us Avg: 1.500us
ResumeOtherThreads:	Sum: 1us Avg: 500ns
Done Dumping Averages
concurrent copying paused:	Sum: 149us 99% C.I. 21us-52us Avg: 37.250us Max: 52us
concurrent copying freed-bytes: Avg: 60MB Max: 96MB Min: 24MB
Freed-bytes histogram: 20480:1,92160:1
concurrent copying total time: 55.016ms mean time: 27.508ms
concurrent copying freed: 4653938 objects with total size 120MB
concurrent copying throughput: 8.46171e+07/s / 2195MB/s  per cpu-time: 2345269925/s / 2236MB/s
concurrent copying tracing throughput: 40MB/s  per cpu-time: 40MB/s
Average major GC reclaim bytes ratio 1.41651 over 2 GC cycles
Average major GC copied live bytes ratio 0.479264 over 6 major GCs
Cumulative bytes moved 27488368
Cumulative objects moved 535717
Peak regions allocated 395 (98MB) / 1024 (256MB)
Total madvise time 28.259ms
Start Dumping Averages for 3 iterations for young concurrent copying
ProcessMarkStack:	Sum: 12.593ms Avg: 4.197ms
ScanImmuneSpaces:	Sum: 12.261ms Avg: 4.087ms
VisitConcurrentRoots:	Sum: 8.879ms Avg: 2.959ms
ClearFromSpace:	Sum: 8.746ms Avg: 2.915ms
ScanCardsForSpace:	Sum: 3.647ms Avg: 1.215ms
InitializePhase:	Sum: 1.786ms Avg: 595.333us
GrayAllDirtyImmuneObjects:	Sum: 1.297ms Avg: 432.333us
SweepSystemWeaks:	Sum: 1.123ms Avg: 374.333us
FlipOtherThreads:	Sum: 431us Avg: 143.666us
EnqueueFinalizerReferences:	Sum: 288us Avg: 96us
SweepArray:	Sum: 250us Avg: 83.333us
RecordFree:	Sum: 120us Avg: 40us
ProcessReferences:	Sum: 105us Avg: 35us
VisitNonThreadRoots:	Sum: 103us Avg: 34.333us
(Paused)GrayAllNewlyDirtyImmuneObjects:	Sum: 91us Avg: 30.333us
FlipThreadRoots:	Sum: 87us Avg: 29us
(Paused)ClearCards:	Sum: 77us Avg: 25.666us
ResumeRunnableThreads:	Sum: 75us Avg: 25us
ThreadListFlip:	Sum: 71us Avg: 23.666us
ForwardSoftReferences:	Sum: 66us Avg: 22us
EmptyRBMarkBitStack:	Sum: 64us Avg: 21.333us
CopyingPhase:	Sum: 45us Avg: 15us
MarkZygoteLargeObjects:	Sum: 44us Avg: 14.666us
SwapBitmaps:	Sum: 28us Avg: 9.333us
(Paused)SetFromSpace:	Sum: 25us Avg: 8.333us
UnBindBitmaps:	Sum: 22us Avg: 7.333us
ReclaimPhase:	Sum: 19us Avg: 6.333us
ResetStack:	Sum: 16us Avg: 5.333us
(Paused)FlipCallback:	Sum: 14us Avg: 4.666us
FreeList:	Sum: 13us Avg: 4.333us
ResumeOtherThreads:	Sum: 3us Avg: 1us
Done Dumping Averages
young concurrent copying paused:	Sum: 375us 99% C.I. 16us-104us Avg: 62.500us Max: 104us
young concurrent copying freed-bytes: Avg: 16MB Max: 24MB Min: 1872KB
Freed-bytes histogram: 0:1,23040:2
young concurrent copying total time: 52.389ms mean time: 17.463ms
young concurrent copying freed: 1858506 objects with total size 49MB
young concurrent copying throughput: 3.57405e+07/s / 958MB/s  per cpu-time: 1005093230/s / 958MB/s
young concurrent copying tracing throughput: 51MB/s  per cpu-time: 51MB/s
Average minor GC reclaim bytes ratio 0.677123 over 3 GC cycles
Average minor GC copied live bytes ratio 0.164037 over 3 minor GCs
Cumulative bytes moved 1356032
Cumulative objects moved 28215
Peak regions allocated 395 (98MB) / 1024 (256MB)
Total time spent in GC: 107.405ms
Mean GC size throughput: 1588MB/s per cpu-time: 1601MB/s
Mean GC object throughput: 6.06345e+07 objects/s
Total number of allocations 6771635
Total bytes allocated 176MB
Total bytes freed 170MB
Free memory 21MB
Free memory until GC 21MB
Free memory until OOME 250MB
Total memory 27MB
Max memory 256MB
Zygote space size 7188KB
Total mutator paused time: 524us
Total time waiting for GC to complete: 4.634us
Total GC count: 5
Total GC time: 107.405ms
Total blocking GC count: 0
Total blocking GC time: 0
Histogram of GC count per 10000 ms: 1:1
Histogram of blocking GC count per 10000 ms: 0:1
Native bytes total: 10099810 registered: 1030530
Total native bytes at last GC: 10065714
/system/framework/oat/arm64/android.hidl.manager-V1.0-java.odex: verify
/system/framework/oat/arm64/android.test.base.odex: verify
/system/framework/oat/arm64/android.hidl.base-V1.0-java.odex: verify
Current JIT code cache size (used / resident): 101KB / 108KB
Current JIT data cache size (used / resident): 74KB / 140KB
Zygote JIT code cache size (at point of fork): 14KB / 32KB
Zygote JIT data cache size (at point of fork): 19KB / 32KB
Current JIT mini-debug-info size: 54KB
Current JIT capacity: 256KB
Current number of JIT JNI stub entries: 1
Current number of JIT code cache entries: 283
Total number of JIT baseline compilations: 158
Total number of JIT optimized compilations: 120
Total number of JIT compilations for on stack replacement: 3
Total number of JIT code cache collections: 2
Memory used for stack maps: Avg: 86B Max: 1776B Min: 16B
Memory used for compiled code: Avg: 408B Max: 6176B Min: 20B
Memory used for profiling info: Avg: 70B Max: 1200B Min: 24B
Start Dumping Averages for 303 iterations for JIT timings
Compiling optimized:	Sum: 67.324ms Avg: 222.191us
Compiling baseline:	Sum: 36.847ms Avg: 121.607us
TrimMaps:	Sum: 5.319ms Avg: 17.554us
Compiling OSR:	Sum: 3.184ms Avg: 10.508us
Code cache collection:	Sum: 2.721ms Avg: 8.980us
Done Dumping Averages
Memory used for compilation: Avg: 37KB Max: 395KB Min: 0B
ProfileSaver total_bytes_written=0
ProfileSaver total_number_of_writes=0
ProfileSaver total_number_of_code_cache_queries=0
ProfileSaver total_number_of_skipped_writes=0
ProfileSaver total_number_of_failed_writes=0
ProfileSaver total_ms_of_sleep=5000
ProfileSaver total_ms_of_work=0
ProfileSaver total_number_of_hot_spikes=5
ProfileSaver total_number_of_wake_ups=4

*** ART internal metrics ***
  Metadata:
    timestamp_since_start_ms: 12970
  Metrics:
    ClassLoadingTotalTime: count = 27126
    ClassVerificationTotalTime: count = 83318
    ClassVerificationCount: count = 350
    WorldStopTimeDuringGCAvg: count = 105
    YoungGcCount: count = 3
    FullGcCount: count = 2
    TotalBytesAllocated: count = 182878912
    TotalGcCollectionTime: count = 106
    YoungGcThroughputAvg: count = 1157
    FullGcThroughputAvg: count = 2141
    YoungGcTracingThroughputAvg: count = 45
    FullGcTracingThroughputAvg: count = 39
    JitMethodCompileTotalTime: count = 89745
    JitMethodCompileCount: count = 281
    YoungGcCollectionTime: range = 0...60000, buckets: 3,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    FullGcCollectionTime: range = 0...60000, buckets: 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    YoungGcThroughput: range = 0...10000, buckets: 1,0,1,1,0,0,0,0,0,0,0,0,0,0,0
    FullGcThroughput: range = 0...10000, buckets: 0,1,0,0,0,1,0,0,0,0,0,0,0,0,0
    YoungGcTracingThroughput: range = 0...10000, buckets: 3,0,0,0,0,0,0,0,0,0,0,0,0,0,0
    FullGcTracingThroughput: range = 0...10000, buckets: 2,0,0,0,0,0,0,0,0,0,0,0,0,0,0
*** Done dumping ART internal metrics ***

suspend all histogram:	Sum: 729us 99% C.I. 0.090us-449.119us Avg: 21.441us Max: 527us
DALVIK THREADS (17):
"main" prio=5 tid=1 Runnable
  | group="main" sCount=0 ucsCount=0 flags=0 obj=0x726052b8 self=0xb4000078c82f27b0
  | sysTid=15987 nice=-10 cgrp=system sched=0/0 handle=0x7a07bd84f8
  | state=R schedstat=( 5879482563 18557656 330 ) utm=574 stm=13 core=7 HZ=100
  | stack=0x7fd397c000-0x7fd397e000 stackSize=8188KB
  | held mutexes= "mutator lock"(shared held)
  at java.lang.ThreadLocal.getMap(ThreadLocal.java:233)
  at java.lang.ThreadLocal.get(ThreadLocal.java:161)
  at androidx.emoji2.text.EmojiMetadata.getMetadataItem(EmojiMetadata.java:132)
  at androidx.emoji2.text.EmojiMetadata.isDefaultEmoji(EmojiMetadata.java:221)
  at androidx.emoji2.text.EmojiProcessor$ProcessorSm.shouldUseEmojiPresentationStyleForSingleCodepoint(EmojiProcessor.java:611)
  at androidx.emoji2.text.EmojiProcessor$ProcessorSm.check(EmojiProcessor.java:542)
  at androidx.emoji2.text.EmojiProcessor.process(EmojiProcessor.java:233)
  at androidx.emoji2.text.EmojiCompat$CompatInternal19.process(EmojiCompat.java:1524)
  at androidx.emoji2.text.EmojiCompat.process(EmojiCompat.java:957)
  at androidx.emoji2.text.EmojiCompat.process(EmojiCompat.java:880)
  at androidx.emoji2.text.EmojiCompat.process(EmojiCompat.java:842)
  at androidx.emoji2.viewsintegration.EmojiInputFilter.filter(EmojiInputFilter.java:77)
  at android.widget.TextView.setText(TextView.java:6263)
  at android.widget.TextView.setText(TextView.java:6227)
  at android.widget.TextView.setText(TextView.java:6179)
  at com.x.androidrsample.MainActivity.onCreate$lambda-3(MainActivity.kt:70)
  at com.x.androidrsample.MainActivity.$r8$lambda$3bnHgeZOWcW347xh6TorM_m5DP8(MainActivity.kt:-1)
  at com.x.androidrsample.MainActivity$$ExternalSyntheticLambda0.onClick(unavailable:-1)
  at android.view.View.performClick(View.java:7455)
  at android.view.View.performClickInternal(View.java:7432)
  at android.view.View.access$3700(View.java:835)
  at android.view.View$PerformClick.run(View.java:28810)
  at android.os.Handler.handleCallback(Handler.java:938)
  at android.os.Handler.dispatchMessage(Handler.java:99)
  at android.os.Looper.loopOnce(Looper.java:201)
  at android.os.Looper.loop(Looper.java:288)
  at android.app.ActivityThread.main(ActivityThread.java:7870)
  at java.lang.reflect.Method.invoke(Native method)
  at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:548)
  at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:1003)

"Signal Catcher" daemon prio=10 tid=6 Runnable
  | group="system" sCount=0 ucsCount=0 flags=0 obj=0x131801f8 self=0xb4000078c8303dd0
  | sysTid=15992 nice=-20 cgrp=system sched=0/0 handle=0x773b317cb0
  | state=R schedstat=( 9480364 0 3 ) utm=0 stm=0 core=4 HZ=100
  | stack=0x773b220000-0x773b222000 stackSize=991KB
  | held mutexes= "mutator lock"(shared held)
  native: #00 pc 0000000000460620  /apex/com.android.art/lib64/libart.so (art::DumpNativeStack(std::__1::basic_ostream<char, std::__1::char_traits<char> >&, int, BacktraceMap*, char const*, art::ArtMethod*, void*, bool)+120)
  native: #01 pc 00000000006ffed0  /apex/com.android.art/lib64/libart.so (art::Thread::DumpStack(std::__1::basic_ostream<char, std::__1::char_traits<char> >&, bool, BacktraceMap*, bool) const+252)
  native: #02 pc 00000000007079a8  /apex/com.android.art/lib64/libart.so (art::DumpCheckpoint::Run(art::Thread*)+304)
  native: #03 pc 000000000031b7dc  /apex/com.android.art/lib64/libart.so (art::ThreadList::RunCheckpoint(art::Closure*, art::Closure*)+628)
  native: #04 pc 00000000006e6eb4  /apex/com.android.art/lib64/libart.so (art::ThreadList::Dump(std::__1::basic_ostream<char, std::__1::char_traits<char> >&, bool)+476)
  native: #05 pc 00000000006e53e8  /apex/com.android.art/lib64/libart.so (art::ThreadList::DumpForSigQuit(std::__1::basic_ostream<char, std::__1::char_traits<char> >&)+360)
  native: #06 pc 00000000006e4c84  /apex/com.android.art/lib64/libart.so (art::Runtime::DumpForSigQuit(std::__1::basic_ostream<char, std::__1::char_traits<char> >&)+188)
  native: #07 pc 0000000000422204  /apex/com.android.art/lib64/libart.so (art::SignalCatcher::HandleSigQuit()+456)
  native: #08 pc 0000000000421580  /apex/com.android.art/lib64/libart.so (art::SignalCatcher::Run(void*)+256)
  native: #09 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #10 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"perfetto_hprof_listener" prio=10 tid=7 Native (still starting up)
  | group="" sCount=1 ucsCount=0 flags=1 obj=0x0 self=0xb4000078c82f7b20
  | sysTid=15993 nice=-20 cgrp=system sched=0/0 handle=0x773a219cb0
  | state=S schedstat=( 95208 0 6 ) utm=0 stm=0 core=7 HZ=100
  | stack=0x773a122000-0x773a124000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009d234  /apex/com.android.runtime/lib64/bionic/libc.so (read+4)
  native: #01 pc 0000000000021110  /apex/com.android.art/lib64/libperfetto_hprof.so (void* std::__1::__thread_proxy<std::__1::tuple<std::__1::unique_ptr<std::__1::__thread_struct, std::__1::default_delete<std::__1::__thread_struct> >, ArtPlugin_Initialize::$_33> >(void*)+280)
  native: #02 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #03 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"ADB-JDWP Connection Control Thread" daemon prio=0 tid=8 WaitingInMainDebuggerLoop
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x13180270 self=0xb4000078c82f96f0
  | sysTid=15994 nice=-20 cgrp=system sched=0/0 handle=0x773a11bcb0
  | state=S schedstat=( 1307343 0 12 ) utm=0 stm=0 core=4 HZ=100
  | stack=0x773a024000-0x773a026000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009e598  /apex/com.android.runtime/lib64/bionic/libc.so (__ppoll+8)
  native: #01 pc 000000000005ba10  /apex/com.android.runtime/lib64/bionic/libc.so (poll+92)
  native: #02 pc 0000000000009dac  /apex/com.android.art/lib64/libadbconnection.so (adbconnection::AdbConnectionState::RunPollLoop(art::Thread*)+752)
  native: #03 pc 000000000000840c  /apex/com.android.art/lib64/libadbconnection.so (adbconnection::CallbackFunction(void*)+1484)
  native: #04 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #05 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Jit thread pool worker thread 0" daemon prio=5 tid=9 Native
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x131802e8 self=0xb4000078c8318b90
  | sysTid=15995 nice=9 cgrp=system sched=0/0 handle=0x76e1c84cb0
  | state=S schedstat=( 99505056 14440882 139 ) utm=7 stm=2 core=7 HZ=100
  | stack=0x76e1b85000-0x76e1b87000 stackSize=1023KB
  | held mutexes=
  native: #00 pc 000000000004c25c  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+28)
  native: #01 pc 0000000000394f3c  /apex/com.android.art/lib64/libart.so (art::ConditionVariable::WaitHoldingLocks(art::Thread*)+148)
  native: #02 pc 00000000007084ac  /apex/com.android.art/lib64/libart.so (art::ThreadPool::GetTask(art::Thread*)+128)
  native: #03 pc 00000000007082b8  /apex/com.android.art/lib64/libart.so (art::ThreadPoolWorker::Run()+136)
  native: #04 pc 0000000000708188  /apex/com.android.art/lib64/libart.so (art::ThreadPoolWorker::Callback(void*)+164)
  native: #05 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #06 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"HeapTaskDaemon" daemon prio=5 tid=10 WaitingForTaskProcessor
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x13180888 self=0xb4000078c831a760
  | sysTid=15996 nice=4 cgrp=system sched=0/0 handle=0x76e0b7ecb0
  | state=S schedstat=( 109490680 2179838 36 ) utm=7 stm=2 core=5 HZ=100
  | stack=0x76e0a7b000-0x76e0a7d000 stackSize=1039KB
  | held mutexes=
  native: #00 pc 000000000004c260  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+32)
  native: #01 pc 00000000003966d8  /apex/com.android.art/lib64/libart.so (art::ConditionVariable::TimedWait(art::Thread*, long, int)+172)
  native: #02 pc 00000000003d83f4  /apex/com.android.art/lib64/libart.so (art::gc::TaskProcessor::GetTask(art::Thread*)+352)
  native: #03 pc 00000000003d8248  /apex/com.android.art/lib64/libart.so (art::gc::TaskProcessor::RunAllTasks(art::Thread*)+32)
  at dalvik.system.VMRuntime.runHeapTasks(Native method)
  at java.lang.Daemons$HeapTaskDaemon.runInternal(Daemons.java:531)
  at java.lang.Daemons$Daemon.run(Daemons.java:139)
  at java.lang.Thread.run(Thread.java:920)

"ReferenceQueueDaemon" daemon prio=5 tid=11 Waiting
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x13180360 self=0xb4000078c831df00
  | sysTid=15997 nice=4 cgrp=system sched=0/0 handle=0x76e0a74cb0
  | state=S schedstat=( 2324478 705157 14 ) utm=0 stm=0 core=0 HZ=100
  | stack=0x76e0971000-0x76e0973000 stackSize=1039KB
  | held mutexes=
  at java.lang.Object.wait(Native method)
  - waiting on <0x02426ba1> (a java.lang.Class<java.lang.ref.ReferenceQueue>)
  at java.lang.Object.wait(Object.java:442)
  at java.lang.Object.wait(Object.java:568)
  at java.lang.Daemons$ReferenceQueueDaemon.runInternal(Daemons.java:217)
  - locked <0x02426ba1> (a java.lang.Class<java.lang.ref.ReferenceQueue>)
  at java.lang.Daemons$Daemon.run(Daemons.java:139)
  at java.lang.Thread.run(Thread.java:920)

"FinalizerDaemon" daemon prio=5 tid=12 Waiting
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x131803d8 self=0xb4000078c831c330
  | sysTid=15998 nice=4 cgrp=system sched=0/0 handle=0x76de96acb0
  | state=S schedstat=( 3652449 636197 13 ) utm=0 stm=0 core=2 HZ=100
  | stack=0x76de867000-0x76de869000 stackSize=1039KB
  | held mutexes=
  at java.lang.Object.wait(Native method)
  - waiting on <0x029911c6> (a java.lang.Object)
  at java.lang.Object.wait(Object.java:442)
  at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:190)
  - locked <0x029911c6> (a java.lang.Object)
  at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:211)
  at java.lang.Daemons$FinalizerDaemon.runInternal(Daemons.java:273)
  at java.lang.Daemons$Daemon.run(Daemons.java:139)
  at java.lang.Thread.run(Thread.java:920)

"FinalizerWatchdogDaemon" daemon prio=5 tid=13 Sleeping
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x13180450 self=0xb4000078c8324e40
  | sysTid=15999 nice=4 cgrp=system sched=0/0 handle=0x76de860cb0
  | state=S schedstat=( 738125 163594 10 ) utm=0 stm=0 core=0 HZ=100
  | stack=0x76de75d000-0x76de75f000 stackSize=1039KB
  | held mutexes=
  at java.lang.Thread.sleep(Native method)
  - sleeping on <0x03bb1587> (a java.lang.Object)
  at java.lang.Thread.sleep(Thread.java:451)
  - locked <0x03bb1587> (a java.lang.Object)
  at java.lang.Thread.sleep(Thread.java:356)
  at java.lang.Daemons$FinalizerWatchdogDaemon.sleepForNanos(Daemons.java:390)
  at java.lang.Daemons$FinalizerWatchdogDaemon.waitForFinalization(Daemons.java:419)
  at java.lang.Daemons$FinalizerWatchdogDaemon.runInternal(Daemons.java:325)
  at java.lang.Daemons$Daemon.run(Daemons.java:139)
  at java.lang.Thread.run(Thread.java:920)

"Binder:15987_1" prio=5 tid=14 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x131804c8 self=0xb4000078c8323270
  | sysTid=16000 nice=0 cgrp=system sched=0/0 handle=0x76dc658cb0
  | state=S schedstat=( 349113 737033 11 ) utm=0 stm=0 core=6 HZ=100
  | stack=0x76dc561000-0x76dc563000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009d4d8  /apex/com.android.runtime/lib64/bionic/libc.so (__ioctl+8)
  native: #01 pc 00000000000592f4  /apex/com.android.runtime/lib64/bionic/libc.so (ioctl+152)
  native: #02 pc 0000000000041e90  /system/lib64/libbinder.so (android::IPCThreadState::joinThreadPool(bool)+260)
  native: #03 pc 0000000000041d78  /system/lib64/libbinder.so (android::PoolThread::threadLoop()+24)
  native: #04 pc 0000000000012094  /system/lib64/libutils.so (android::Thread::_threadLoop(void*)+260)
  native: #05 pc 00000000000c1318  /system/lib64/libandroid_runtime.so (android::AndroidRuntime::javaThreadShell(void*)+144)
  native: #06 pc 0000000000011964  /system/lib64/libutils.so (thread_data_t::trampoline(thread_data_t const*)+404)
  native: #07 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #08 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Binder:15987_2" prio=5 tid=15 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x13180540 self=0xb4000078c83216a0
  | sysTid=16001 nice=0 cgrp=system sched=0/0 handle=0x76db55acb0
  | state=S schedstat=( 7568075 3138489 18 ) utm=0 stm=0 core=4 HZ=100
  | stack=0x76db463000-0x76db465000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009d4d8  /apex/com.android.runtime/lib64/bionic/libc.so (__ioctl+8)
  native: #01 pc 00000000000592f4  /apex/com.android.runtime/lib64/bionic/libc.so (ioctl+152)
  native: #02 pc 0000000000041e90  /system/lib64/libbinder.so (android::IPCThreadState::joinThreadPool(bool)+260)
  native: #03 pc 0000000000041d78  /system/lib64/libbinder.so (android::PoolThread::threadLoop()+24)
  native: #04 pc 0000000000012094  /system/lib64/libutils.so (android::Thread::_threadLoop(void*)+260)
  native: #05 pc 00000000000c1318  /system/lib64/libandroid_runtime.so (android::AndroidRuntime::javaThreadShell(void*)+144)
  native: #06 pc 0000000000011964  /system/lib64/libutils.so (thread_data_t::trampoline(thread_data_t const*)+404)
  native: #07 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #08 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Binder:15987_3" prio=5 tid=16 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x131805b8 self=0xb4000078c831fad0
  | sysTid=16002 nice=0 cgrp=system sched=0/0 handle=0x76da45ccb0
  | state=S schedstat=( 367708 7968 6 ) utm=0 stm=0 core=6 HZ=100
  | stack=0x76da365000-0x76da367000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009d4d8  /apex/com.android.runtime/lib64/bionic/libc.so (__ioctl+8)
  native: #01 pc 00000000000592f4  /apex/com.android.runtime/lib64/bionic/libc.so (ioctl+152)
  native: #02 pc 0000000000041e90  /system/lib64/libbinder.so (android::IPCThreadState::joinThreadPool(bool)+260)
  native: #03 pc 0000000000041d78  /system/lib64/libbinder.so (android::PoolThread::threadLoop()+24)
  native: #04 pc 0000000000012094  /system/lib64/libutils.so (android::Thread::_threadLoop(void*)+260)
  native: #05 pc 00000000000c1318  /system/lib64/libandroid_runtime.so (android::AndroidRuntime::javaThreadShell(void*)+144)
  native: #06 pc 0000000000011964  /system/lib64/libutils.so (thread_data_t::trampoline(thread_data_t const*)+404)
  native: #07 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #08 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Profile Saver" daemon prio=5 tid=17 Native
  | group="system" sCount=1 ucsCount=0 flags=1 obj=0x13180630 self=0xb4000078c8326a10
  | sysTid=16007 nice=9 cgrp=system sched=0/0 handle=0x76d49c4cb0
  | state=S schedstat=( 3113594 1469790 8 ) utm=0 stm=0 core=7 HZ=100
  | stack=0x76d48cd000-0x76d48cf000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000004c260  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+32)
  native: #01 pc 00000000003966d8  /apex/com.android.art/lib64/libart.so (art::ConditionVariable::TimedWait(art::Thread*, long, int)+172)
  native: #02 pc 00000000003ebba4  /apex/com.android.art/lib64/libart.so (art::ProfileSaver::Run()+500)
  native: #03 pc 00000000003e4b6c  /apex/com.android.art/lib64/libart.so (art::ProfileSaver::RunProfileSaverThread(void*)+148)
  native: #04 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #05 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"RenderThread" daemon prio=7 tid=18 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x131806a8 self=0xb4000078c832a1b0
  | sysTid=16008 nice=-10 cgrp=system sched=0/0 handle=0x76d38a6cb0
  | state=S schedstat=( 17951396 1572086 58 ) utm=0 stm=1 core=4 HZ=100
  | stack=0x76d37af000-0x76d37b1000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009e498  /apex/com.android.runtime/lib64/bionic/libc.so (__epoll_pwait+8)
  native: #01 pc 0000000000016628  /system/lib64/libutils.so (android::Looper::pollInner(int)+180)
  native: #02 pc 000000000001650c  /system/lib64/libutils.so (android::Looper::pollOnce(int, int*, int*, void**)+112)
  native: #03 pc 00000000003c7298  /system/lib64/libhwui.so (android::uirenderer::ThreadBase::waitForWork()+132)
  native: #04 pc 00000000003c70e8  /system/lib64/libhwui.so (android::uirenderer::renderthread::RenderThread::threadLoop()+76)
  native: #05 pc 0000000000012094  /system/lib64/libutils.so (android::Thread::_threadLoop(void*)+260)
  native: #06 pc 0000000000011964  /system/lib64/libutils.so (thread_data_t::trampoline(thread_data_t const*)+404)
  native: #07 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #08 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"hwuiTask0" daemon prio=6 tid=19 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x13180720 self=0xb4000078c8338030
  | sysTid=16013 nice=-2 cgrp=system sched=0/0 handle=0x76d12b5cb0
  | state=S schedstat=( 212814 165468 7 ) utm=0 stm=0 core=5 HZ=100
  | stack=0x76d11be000-0x76d11c0000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000004c25c  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+28)
  native: #01 pc 0000000000050880  /apex/com.android.runtime/lib64/bionic/libc.so (__futex_wait_ex(void volatile*, bool, int, bool, timespec const*)+144)
  native: #02 pc 00000000000b0a8c  /apex/com.android.runtime/lib64/bionic/libc.so (pthread_cond_wait+80)
  native: #03 pc 00000000000564e0  /system/lib64/libc++.so (std::__1::condition_variable::wait(std::__1::unique_lock<std::__1::mutex>&)+20)
  native: #04 pc 0000000000472224  /system/lib64/libhwui.so (android::uirenderer::CommonPool::workerLoop()+92)
  native: #05 pc 0000000000472108  /system/lib64/libhwui.so (void* std::__1::__thread_proxy<std::__1::tuple<std::__1::unique_ptr<std::__1::__thread_struct, std::__1::default_delete<std::__1::__thread_struct> >, android::uirenderer::CommonPool::CommonPool()::$_0> >(void*)+192)
  native: #06 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #07 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"hwuiTask1" daemon prio=6 tid=20 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x13180798 self=0xb4000078c8339c00
  | sysTid=16014 nice=-2 cgrp=system sched=0/0 handle=0x76d11b7cb0
  | state=S schedstat=( 255467 609844 11 ) utm=0 stm=0 core=4 HZ=100
  | stack=0x76d10c0000-0x76d10c2000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000004c25c  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+28)
  native: #01 pc 0000000000050880  /apex/com.android.runtime/lib64/bionic/libc.so (__futex_wait_ex(void volatile*, bool, int, bool, timespec const*)+144)
  native: #02 pc 00000000000b0a8c  /apex/com.android.runtime/lib64/bionic/libc.so (pthread_cond_wait+80)
  native: #03 pc 00000000000564e0  /system/lib64/libc++.so (std::__1::condition_variable::wait(std::__1::unique_lock<std::__1::mutex>&)+20)
  native: #04 pc 0000000000472224  /system/lib64/libhwui.so (android::uirenderer::CommonPool::workerLoop()+92)
  native: #05 pc 0000000000472108  /system/lib64/libhwui.so (void* std::__1::__thread_proxy<std::__1::tuple<std::__1::unique_ptr<std::__1::__thread_struct, std::__1::default_delete<std::__1::__thread_struct> >, android::uirenderer::CommonPool::CommonPool()::$_0> >(void*)+192)
  native: #06 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #07 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Binder:15987_4" prio=5 tid=21 Native
  | group="main" sCount=1 ucsCount=0 flags=1 obj=0x13180810 self=0xb4000078c833d3a0
  | sysTid=16015 nice=0 cgrp=system sched=0/0 handle=0x76d23b3cb0
  | state=S schedstat=( 1680728 1854949 13 ) utm=0 stm=0 core=5 HZ=100
  | stack=0x76d22bc000-0x76d22be000 stackSize=991KB
  | held mutexes=
  native: #00 pc 000000000009d4d8  /apex/com.android.runtime/lib64/bionic/libc.so (__ioctl+8)
  native: #01 pc 00000000000592f4  /apex/com.android.runtime/lib64/bionic/libc.so (ioctl+152)
  native: #02 pc 0000000000041e90  /system/lib64/libbinder.so (android::IPCThreadState::joinThreadPool(bool)+260)
  native: #03 pc 0000000000041d78  /system/lib64/libbinder.so (android::PoolThread::threadLoop()+24)
  native: #04 pc 0000000000012094  /system/lib64/libutils.so (android::Thread::_threadLoop(void*)+260)
  native: #05 pc 00000000000c1318  /system/lib64/libandroid_runtime.so (android::AndroidRuntime::javaThreadShell(void*)+144)
  native: #06 pc 0000000000011964  /system/lib64/libutils.so (thread_data_t::trampoline(thread_data_t const*)+404)
  native: #07 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #08 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)
  (no managed stack frames)

"Binder:15987_4" prio=5 (not attached)
  | sysTid=16019 nice=0 cgrp=system
  | state=S schedstat=( 67240 375208 1 ) utm=0 stm=0 core=7 HZ=100
  native: #00 pc 000000000004c25c  /apex/com.android.runtime/lib64/bionic/libc.so (syscall+28)
  native: #01 pc 0000000000050880  /apex/com.android.runtime/lib64/bionic/libc.so (__futex_wait_ex(void volatile*, bool, int, bool, timespec const*)+144)
  native: #02 pc 00000000000b0a8c  /apex/com.android.runtime/lib64/bionic/libc.so (pthread_cond_wait+80)
  native: #03 pc 00000000000564e0  /system/lib64/libc++.so (std::__1::condition_variable::wait(std::__1::unique_lock<std::__1::mutex>&)+20)
  native: #04 pc 000000000009557c  /system/lib64/libgui.so (android::AsyncWorker::run()+128)
  native: #05 pc 00000000000aba9c  /system/lib64/libgui.so (void* std::__1::__thread_proxy<std::__1::tuple<std::__1::unique_ptr<std::__1::__thread_struct, std::__1::default_delete<std::__1::__thread_struct> >, void (android::AsyncWorker::*)(), android::AsyncWorker*> >(void*)+72)
  native: #06 pc 00000000000b1810  /apex/com.android.runtime/lib64/bionic/libc.so (__pthread_start(void*)+264)
  native: #07 pc 00000000000512f0  /apex/com.android.runtime/lib64/bionic/libc.so (__start_thread+64)

----- end 15987 -----

----- Waiting Channels: pid 15987 at 2022-10-03 16:52:23.937732133+0200 -----
Cmd line: com.x.androidrsample

sysTid=15987     0
sysTid=15992     do_sigtimedwait
sysTid=15993     pipe_read
sysTid=15994     do_sys_poll
sysTid=15995     futex_wait_queue_me
sysTid=15996     futex_wait_queue_me
sysTid=15997     futex_wait_queue_me
sysTid=15998     futex_wait_queue_me
sysTid=15999     futex_wait_queue_me
sysTid=16000     binder_ioctl_write_read
sysTid=16001     binder_ioctl_write_read
sysTid=16002     binder_ioctl_write_read
sysTid=16007     futex_wait_queue_me
sysTid=16008     SyS_epoll_wait
sysTid=16013     futex_wait_queue_me
sysTid=16014     futex_wait_queue_me
sysTid=16015     binder_ioctl_write_read
sysTid=16019     futex_wait_queue_me

----- end 15987 -----
```
