
var timer = document.getElementById("timer");
var timeRemaining = 180;
var testPara = document.getElementById("testPara");
var textArea = document.getElementById("textArea");
var startWindow = document.getElementById("startWindow");
var startButton = document.getElementById("startButton");
var newTestWindow = document.getElementById("newTestWindow");
var newTestButton = document.getElementById("newTestButton");
var score = 0;


var calculateScore = function() {
	var paraSubmitted = textArea.value;
	var submittedWords = paraSubmitted.split(" ");
	var wordCount = submittedWords.length; 

	var testWords = testPara.innerHTML.split(" ");
	console.log(testWords);

	return wordCount;
};


var generatePassage = function(){
	
	paraContainer.style.display = "inline-block";
	textArea.style.display = "inline-block";
	var passages = [passage1, passage2, passage3, passage4, passage5];
	testPara.innerHTML = passages[Math.floor(Math.random()*10/2)];

};


var calculateEarning = function() {
    var paraSubmitted = textArea.value;
    var submittedWords = paraSubmitted.split(" ");
    var wordCount = submittedWords.length;
    var characterCount = (wordCount/3)*5;
    var earningCalculated = (((((characterCount*14000))/1000)*12)/3);

    return earningCalculated;
};



var displayTime = function () {

	var getTime = setInterval(function() {
		timeRemaining--;
        timer.innerHTML = "সময় বাকিঃ " + timeRemaining + "সেকেন্ড"; 

		console.log(timeRemaining);

		if(timeRemaining == 0){

			clearInterval(getTime);
			
			var wrapper = document.getElementById("wrapper");
			wrapper.remove();

			timer.remove();

			document.body.appendChild(newTestWindow);
            document.getElementById("finalScore").innerHTML = "আপনার স্পিড ৩ মিনিটে প্রায় " + calculateScore() + " ওয়ার্ড।" + " এই স্পিডে আপনি প্রতিদিন কাজ করলে মাসিক প্রায় " + calculateEarning() + " টাকা আয় করতে পারবেন। তবে আপনার স্পিড বাড়লে কিম্বা আরও সোজা কাজ থাকলে তা অবশ্যই বাড়বে। সাধারণত এত কঠিন থাকবেনা। বাট আপনাকে মিনিমাল ইনকাম দেখানো হচ্ছে তাই দেখালাম।";
			newTestWindow.style.display = "block";
		} 
	}, 1000);

	textArea.removeEventListener("keydown", displayTime);
};

var test = function() {
	
	startWindow.style.display = "none";

	timer.innerHTML = "সময় বাকি: 180s";
	timer.style.display = "block";

	textArea.addEventListener("keydown", displayTime);

	generatePassage();

};

startButton.addEventListener("click", test);


newTestButton.addEventListener("click", function(){
	window.location.reload();
});

var passage1 = "ছাত্র শিক্ষকের সম্পর্ক হওয়া উচিৎ বইকেন্দ্রিক। সেই সম্পর্ 24354 ক যদি বিনিময় মূল্যে চলে যায় তাহলে সম্মানীর সম্মানের তলায় ৭৮৫ পিষে যায়। কলেজ ৬৮৬ে থাকতে আমি দেখতাম 6988 বেশীরভাগ শিক্ষক টাকার বিনিময়ে ব্যাচ করে পড়াচ্ছে। আমি ৫৭৮ নিজেও পড়তাম। Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. এমনও হয়েছে স্যারের বাসায় গিয়ে আমরা পড়ছি অথচ স্যার আমাদের চিনেন না। মাসে মাসে টাকা নিচ্ছেন আর পড়িয়ে যাচ্ছেন। আমি বলছিনা শিক্ষকদের টাকার দরকার নেই, কিন্ 454 তু ব্যাপারটা যদি এমন আমি শুধু টাকা নিলাম আর পড়ালাম, ছাত্র চিনলাম না, আচার চিনলাম না, রিভিউ বিবেচনা করলাম না তাহলে তো সেটা বাণিজ্য হয়ে গেল। 7854 আর আমাদের দেশে হচ্ছেই সেটা। টাকার বিনিময়ে শিক্ষা আমরা পেয়ে গেলে আমরা কেন শিক্ষােয়ে যাওয়ার পর আর তাকে সম্মান করবো। 4187 তাকে তো আমাদের আর প্রয়োজন নেই।সে টাকা পেয়েছে আমাদের একাডেমিক শিক্ষা দিয়েছে।ব্যস, তার সাথে আমাদের সম্পর্ক এটুকুই।এখানে সম্মানের আর বালাই নেই। বিশ্ববিদ্যালয় শিক্ষকেরা এসব দিক থেকে এক কাঠি উপরে। এরা লড়াই করে ইগোর জন্য, accusamus et iusto odio dignissimos ducimus qui 65 blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, টাকার জন্য নয়। আমি দেখেছি প্রায় বিশ্ববিদ্যালয় এর শিক্ষকেরা অন্য বিশ্ববিদ্যালয়কে হেয় করতে পছন্দ করে। তা 654 দের দৃষ্টিতে তারাই সেরা,দেশের আর কোথাও তাদের মত সার্ভিস দেয়া হয়না। বাস্তবতা এই পর্যন্ত সীমাবদ্ধ হলে ভালো ছিলো কিন্তু বাস্তবতায় এরা অন্য ডিপার্টমেন্টকেও পাত্তা দিতে নারাজ। একজন শিক্ষক আরেকজন শিক্ষকের নামে দূর্নাম করছে। সেটা চেম্বারে, ক্লাসে এমনকি সমাবেশে! তারা এটা বুঝতেছে না এই যে তারা আরেকজন শিক্ষককে অসম্মান করে কথা বলছে এতে তাদের সম্মানও কমছে। ছাত্ররা তার সম্পর্কেও বিরূপ প্রতিক্রিয়া ধারণ করছে। কাউকে অমর্যাদা করে মর্যাদা পাওয়া যায় না। তারপর কিছু শিক্ষক রাজনৈতিক ছত্রছায়ায় আছেন। রাজনৈতিক আদর্শ এক ব্যাপার আর ছত্রছায়ায় থাকা আরেক ব্যাপার। কেউ যদি রাজনীতিকে ব্যবহার করে বিশেষ উদ্দেশ্য হাসিল করে বা করতে চায় সেটা সে হাসিল করলেও কিন্তু সত্যটা সাধারণ ছাত্রদের কাছে বের হয়ে আসেই। ফলে, তাদের ব্যক্তিগত ফায়দা হাসিল হলেও তাদের জন্য বরাদ্দ সম্মানের ঘরটা সংকীর্ণ হয়ে যায়। ";

var passage2 = "সুইডেন আসার পর বছরে ৫৪ অন্তত একবার হলেও শী 685 পে ঘুরতে যাওয়া হয়। Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, ৭৮৯৮ eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. শীপগুলো স্টকহোম থেকে বিভিন্ন দেশে যায় । কিন্ত আমরা বেশীর ভাগ অবু , তুরকু,মারিহাম বড়জোরহেলসিংকিতে যাই । কারন অবু,তুরকু,মারিহাম সকালে যেয়ে পরের দিন সকালে এসে নামা যায়, ৮৭৮ আর হেলসিংকিতে গেলে বিকালে স্টকহোম থেকে শীপে উঠলে পরের দিন সকালে ওখানে নামাবে ,সারাদিন ৬৭৯৮ নিজেদের ইচ্ছা মত ঘুরে বিকালে আবার হেলসিংকি থেকে শীপ ছেরে পরের দিন সকালে স্টকহোম পৌঁছবে । শীপে পয়সাও খুব কম লাগে যদি সময় দেখে টিকেট বুক দেয়া হয় এমন কি ফ্রীতে পাওয়া যায় অনেক সময় ।তবে এটা নয় শীপ বিনা লাভেই এটা করছে । এটা তাদের একটা ব্যবসা ।কারন ১০--১৪ ফ্লোরের শীপটাই একটা চলন্ত শহর। কি নেই এই শীপে বাচ্চাদের accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et q 65 uas molestias excepturi sint occaecati cupiditate non provident, খেলার জায়গা, সুইমিংপুল, ল্যাইব্রেরী, শপিংমল,রেষ্টুডেন্ট,ডিসকো । শীপজার্নির বর্ণনার মাঝে মাঝে ছবি থাকবে । (ছবিগুলো সবই নেট থেকে নেয়া) ১৬ বছরে কম করে হলেও ১৬ বার এই শীপে বেড়ানো হয়েছে তার মাঝে ২০১৪ এর আগষ্ট মাসের শীপ ৯৮ জার্নি আমার জীবনে স্বরনীয় হয়ে আছে হয়ত থাকবেও । সে এক ভয়ংকর অভিজ্ঞতা। প্রতি বছরই স্কুল থেকে আমাদের কোথাও নিয়ে যাওয়া হয় ৫ দিনের জন্য ,কখনো এটা সুইডেনের ভিতরেই অন্যকোন শহরে কখনো অন্যকোন দেশে । আমার কখনো যাওয়া হয় না কারন বাসা থেকে অনুমতি পাই না । ২০১৩তে কলেজ শেষ বছর, শীপে হেলসিংকিতে যাবে পরেরদিন ফেরত আসবে তাই অনেক অনুনয় বিনয় করে বাসা থেকে অনুমতি আদায় করলাম ।";

var passage3 = "শীপ চলছে হেলে 6566  দুলে, কানে আসতেছে উপেন কনসার্টের মিউজিকের সুর, সবার মনটা উরু উরু করছ 6898 ওখানে যাবার জন্য এমন সময় এক ছাত্রী বলে, ৬৫৮৯৬ আন্না আমার মাথা ঘুরাচ্ছে আমি রুমে যাই, বলেই সে ৬৫৪ চলে গেল , কিছুক্ষন পর আরেকজন , কিছুক্ষন পর আরেকজন কিন্ত কেউ বুঝতে পারছে না কেন এমন হচ্ছে । Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. আস্তে আস্তে সবার মাঝেই এটা সংক্রমিত হল ,কিসের উপেন কনসার্ট আর কিসের ডিসকো সবাই যার যার রুমে । আমি রুমে ঢুকার সাথে সাথেই আমার বমি শুরু হল । আমি লজ্জা আর ভয়ে চু 356 পসে গেলাম । মনে করেছি বমি শুধু আমারই হয়েছে । কিন্ত না, আন্না খবর নিয়ে এসে জানাল সবারই কম- বেশী বমি হচ্ছে ,আন্না ও মারিয়ারও হল, তখন মনে একটু সাহস পেলাম, শুধু আমার একা না সবারই এই সমস্যা হচ্ছে । এই প্রথম বার মনে হল জাহাজটা খুব জোরে কেঁপে উঠল । আমি তো চিৎকার দিয়ে, আন্না শীপ এমন করছে কেন ?আন্না : বাহিরে ঝড় হচ্ছে তো তাই । শীপের দুলুনী ক্রমেই , বাড়ছে আমি ভয়ে কান্না করছি সাথে বমিও হচ্ছে । আন্না, মারিয়া আমার মাথায় হাত বুলিয়ে আদর করে, কান্না করছ কেন ? আমি : এখন শীপ যদি ডুবে যায় তাহলে তো আমি মরে যাব, আমার আপনজন কেউ তো সাথে নেই, সবার কথা মনে হচ্ছে ,হয়ত ওরা আমার লাশ accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, টাও পাবে না । আন্না, মারিয়া হেসে , আরে পাগল কিছু হবে না , এ শীপ কখনো ডুববে না ,তুমি একটু ঘুমানোর চেষ্টা কর, দেখ সব ঠিক হয়ে যাবে।  । আস্তে আস্তে সবার মাঝেই এটা সংক্রমিত হল ,কিসের উপেন কনসার্ট আর কিসের ডিসকো সবাই যার যার রুমে । আমি রুমে ঢুকার সাথে সাথেই আমার বমি শুরু হল । আমি 69889 লজ্জা আর ভয়ে চুপসে গেলাম । মনে করেছি বমি শুধু আমারই হয়েছে । কিন্ত না, আন্না খবর নিয়ে এসে জানাল সবারই কম- বেশী বমি হচ্ছে ,আন্না ও মারিয়ারও হল, তখন মনে একটু সাহস পেলাম, শুধু আমার একা না সবারই এই সমস্যা হচ্ছে । এই প্রথম বার মনে হল জাহাজটা খুব জোরে কেঁপে উঠল । আমি তো চিৎকার দিয়ে, আন্না শীপ এমন করছে কেন ?আন্না : বাহিরে ঝড় হচ্ছে তো তাই । শীপের দুলুনী ক্রমেই , বাড়ছে আমি ভয়ে কান্না করছি সাথে বমিও হচ্ছে । আন্না, মারিয়া আমার মাথায় হা। ";

var passage4 = "তুমি যেতে পারলে আমাদের তো কোন ৬৫৬৫ সমস্যা নেই ।সবার সাথে নাস্তা করে আমি ও বের হলাম ।আমাদের বাস ভাড়া করা ছিল কিন্ত কিছু দুর আমাদের ৬৫ হেঁটে যেয়ে বাসে উঠতে হবে ।অল্প কিছুদুর যাওয়ার পর আমার মাথাটা কেমন যেন ঘুরে উঠল চোখের সামনে সব অন্ধকার মনে হল, তারপর আর কিছু বলতে পারি না। Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. প্রায় তিন ঘন্টা পর নিজেকে আবিষ্কার করলাম হাসপাতালের বেডে হাতে স্যালাইন লাগানো, সবাই মিউজিয়াম ৬৫৮ে চলে গিয়েছে শুধু একটা মেয়ে আমার কাছে থেকে গিয়েছে। কিছুক্ষন পরই বেশ সুস্থ অনুভব করলাম , আমাদের সময় অনুযায়ী হাসপাতাল থেকে টেক্সি নিয়ে শীপ কাউন্টারে চলে আসলাম। আবার সারারাত শীপে থাকতে হবে ভেবেই ভয় লাগছিল । আলহামদুল্লিলাহ ! এই রাতে কোন ঝড় ছিল না । এক ঘুমে স্টকহোম । মলাসইলমুইনা বলেছেন: পড়লাম | ভয় পেলাম খানিকটা ঝড়ের জন্য (অনেক দিন আগে তুমুল ঝরে চড়ে জাহাজ থামিয়ে রাখা রাতের কোথাও মনে  65565 হলো), বেড়াতে যেয়ে হাসপাতাল যাত্রী হওয়ায় আপনার জন্য খারাপও লাগলো কিন্তু আপনার ভ্রমণ পরে ভালো লাগলো | ভাইকিং শিপিং লাইনের নাম মুখেও আনবোনা আগে মনে হয় কেন জানি বলেছিলাম এবার সেটা কনফার্ম করলাম | নো হেলসিংকি, নো স্টোকহোম| accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, আমি যে পাড়ে সে পাড়েই জীবন না হয় কাটিয়ে দিলাম | নো ভাইকিং লাইন শিপ বিজনেস !! সম্রাট ইজ বেস্ট বলেছেন: ভ্রমণের অভিজ্ঞতা একেকজনের একেকরকম। সবার জন্য সুখকর হয় না। সী সিকনেসে ভোগা একটা কমন সমস্যা। ও নিয়ে হীনম্মন্যতা থাকতে নেই। আপনার জার্নিটা হাজারও সুখস্মৃতির মাঝে একটু ব্যতিক্রম হয়ে থাকুক না। এনিওয়ে, শিপটা খুব সুন্দর লাগল। ধন্যবাদ এমন একটা ভ্রমণের কাহিনী শেয়ার করার জন্য।";

var passage5 = "পেশায় নাবিক, ৮০বছরের ডেভিন 897879  জীবনের ৩০ বছর পার করে দিয়েছেন সাগরে সাগরে বন্দরে বন্দরে। যখন ডাঙ্গায় উঠলেন তখন বয়স ৬০ ছুঁয়েছে। প্রেম করে বিয়ে করেছেন কেনিয়ান 645 akoth কে। তার ধারণা দুনিয়ার অন্যতম সুন্দরী akoth ৬৫৭৯। আমি akoth উচ্চারণ করতে পারছিনা। ফলে সে বার বার চেষ্টা করছে আমাকে শিখাতে। Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. তার ধারনা এত সুন্দরী একটা মেয়ের নাম এতটা অশুদ্ধ ভাবে উচ্চারণ করা নেহাতি অন্যায়। অবশেষ আমাকে কাগজে লিখে উচ্চারণ শেখায়। গল্প করা ছাড়া আমাদের কোন কাজ নেই, আজ সন্ধ্যা পর্যন্ত। একজন মানুষ কতটা মজার গল্প করতে পারে, ডেভিনকে না দেখে বুঝার উপায় নেই। আমরা যে পার্কে বসে গল্প করছি। সেখানে তেমন কোন মানুষ আসে না। অল্প কয়েকজন বুড়ো বুড়ি বসে আছেন। সন্ধ্যা নামে নামে। আমি্ ডেভিনকে তাদের কটেজের দিকে এগিয়ে দিয়ে, accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, ফিরে আসার প্রস্তুতি নিচ্ছি। ডেভিন বলল তুমি থাকো আর অল্প কিছু সময়। akoth চলে এলো মনে হয়। সুন্দরী akoth এর সাথে এক কাপ চা পান করার সুযোগ থেকে তোমাকে বঞ্চিত করতে চাই না। হা: হা: হা: হা: সূর্য ডুবার পর পরই সারাদিন কোথায় ঘুরে এক বিশাল কেনা কাটার স্তুপ নিয়ে akoth ফিরে এলো। akoth সম্পর্কে এত সময় যা যা গল্প শুনেছিলাম তার সাথে কোন মিল পাচ্ছি না। ১৫০ কেজি অধিক (আনুমানিক) akoth মনে হল পুরো শরীরটা নিয়ে চলতে পারছে না।";
